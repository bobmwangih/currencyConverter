package controllers;

public class CurrencyRate {
	private static double usdToKsh = 111.58;
	private static double kshToUsd = 0.0090;
	private static double euroToKsh = 135.69;
	private static double kshToEuro = 0.0074;
	private static double tzToKsh = 0.048;
	private static double kshToTz = 20.78;
	private static double ugToKsh = 0.030;
	private static double kshToUg = 32.87;

	private static double usdToUg = 3667.79;
	private static double ugToUsd = 0.00027;
	private static double euroToUg = 4460.32;
	private static double ugToEuro = 0.00022;
	private static double tzToUg = 1.58;
	private static double ugToTz = 0.63;

	private static double usdToTz = 2319.00;
	private static double tzToUsd = 0.00043;
	private static double euroToTz = 2820.09;
	private static double tzToEuro = 0.00035;

	private static double usdToEuro = 0.82;
	private static double euroToUsd = 1.22;

	private static double notApplicable = 0.0;

	public static double getCurrencyRate(String from, String to) {
		if (!(from.equals(to))) {
			if (to.equals("ksh")) {

				switch (from) {
				case "usd":
					return usdToKsh;
				case "euro":
					return euroToKsh;
				case "tz":
					return tzToKsh;
				case "ug":
					return ugToKsh;
				}
			} else if (from.equals("ksh")) {
				switch (to) {
				case "usd":
					return kshToUsd;
				case "euro":
					return kshToEuro;
				case "tz":
					return kshToTz;
				case "ug":
					return kshToUg;
				}
			}
			if (to.equals("ug")) {
				switch (from) {
				case "usd":
					return usdToUg;
				case "euro":
					return euroToUg;
				case "tz":
					return tzToUg;
				}
			} else if (from.equals("ug")) {
				switch (to) {
				case "usd":
					return ugToUsd;
				case "euro":
					return ugToEuro;
				case "tz":
					return ugToTz;
				}
			}
			if (to.equals("tz")) {
				switch (from) {
				case "usd":
					return usdToTz;
				case "euro":
					return euroToTz;
				}
			} else if (from.equals("tz")) {
				switch (to) {
				case "usd":
					return tzToUsd;
				case "euro":
					return tzToEuro;
				}
			}

			if (to.equals("euro")) {
				return usdToEuro;
			} else if (from.equals("euro")) {
				return euroToUsd;
			}
		} else {
			return notApplicable;
		}

		return 0;
	}
}
