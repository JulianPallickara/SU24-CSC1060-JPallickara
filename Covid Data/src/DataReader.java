import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.io.File;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;

public class DataReader {

	public Date convertStringToDate(String dateString) {
		Date date = null;
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		try {
			date = df.parse(dateString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date;
	}
//HashTables contain key value pairs. so skibidi-sigma!

	public int getTotalNumberOfCases(Hashtable<Date, Integer> cases) {
		Enumeration<Date> e = cases.keys();
		int addedCases = 0;
		while (e.hasMoreElements()) {
			Date date = e.nextElement();
			addedCases += cases.get(date);
		}
		return addedCases;

	}

	public int getMonthlyCases(Hashtable<Date, Integer> cases, int year, int month) {
		System.out.println("Computing cases for your month, " + month + ", and your year, " + year);
		Enumeration<Date> e = cases.keys();
		int monthCases = 0;
		while (e.hasMoreElements()) {
			Date date = e.nextElement();
			if (month == date.getMonth()) {
				monthCases += cases.get(date);
			}

		}
		return monthCases;
	}

	public int getYearlyCases(Hashtable<Date, Integer> cases, int year) {
		System.out.println("Computing values for year " + year);
		int yearlyCases = 0;
		Enumeration<Date> e = cases.keys();
		int[] months = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		for (int i = 0; i < months.length; i++) {
			yearlyCases += getMonthlyCases(cases, year, months[i]);
		}

		return yearlyCases;

	}

	public static void main(String[] args) {
		String file = "/Users/jpallickara/Downloads/items.txt";

		DataReader dataReader = new DataReader();
		Hashtable<Date, Integer> cases = new Hashtable<Date, Integer>();

		try {
			Scanner read = new Scanner(new File(file));

			while (read.hasNext()) {

				String rowString = read.nextLine();

				String[] elements = rowString.split(" ");

				Date date = dataReader.convertStringToDate(elements[0]);
				int numberOfCases = Integer.parseInt(elements[2]);

				cases.put(date, numberOfCases);

				//System.out.println("Number of covid cases on " + date + " was " + numberOfCases);
			}
			System.out.println("The total number of cases was " + dataReader.getTotalNumberOfCases(cases));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Scanner scn = new Scanner(System.in);

		
		System.out.println("Enter 1 year for annual cases. \n"
				+ "Enter 2 month year for the month and year you would like. \n " 
				+ " This will total the number of cases up till said point.");
		String num = scn.next();

		int year=0;
		
		switch (num) {
		case "1":
			year = scn.nextInt();
			int yearly = dataReader.getYearlyCases(cases, year);
			System.out.println("The amount of cases in [" + year + "] was " + yearly);
		case "2":
			int month = scn.nextInt();
			year = scn.nextInt();
			int yearAndMonth = dataReader.getMonthlyCases(cases, year, month);
			System.out.println("The number of cases in the month [" + month + "] in the year [" + year + "] was " + yearAndMonth);
			break;
		default:
			System.out.println("Please enter a valid number.");

		}

	}

}
