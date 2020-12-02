package Aufgabe2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Application {

    public static void main(String[] args) {
        Payment[] payments = new Payment[]{
                new Payment("4929 739 90 0138", "18/1/2020", "€6,42"),
                new Payment("448584 2070332466", "27/1/2020", "€0,36"),
                new Payment("4929 739 90 0138", "05/1/2020", "€8,04"),
                new Payment("4929 580 36 3634", "14/4/2019", "€16,50"),
                new Payment("448 59136 30015 295", "11/1/2020", "€19,41"),
                new Payment("455664 704112 8388", "23/4/2020", "€18,77"),
                new Payment("4716 353 38 4339", "13/4/2019", "€4,89"),
                new Payment("4716 353 23 9392", "08/4/2019", "€7,40"),
                new Payment("4716 882 15 2454", "24/4/2019", "€9,65"),
                new Payment("4024007150480654", "13/9/2019", "€0,28"),
                new Payment("4024007168244", "21/1/2020", "€15,90"),
                new Payment("4539 515 94 0628", "29/1/2020", "€0,27"),
                new Payment("4532059658839", "13/1/2020", "€7,04"),
                new Payment("402 40071 28450 425", "11/4/2019", "€2,28"),
                new Payment("4556 434 58 6951", "23/4/2020", "€2,33"),
                new Payment("4916 4495 7634 0685", "10/1/2020", "€17,71"),
                new Payment("4716 8716 5630 9680", "06/1/2020", "€1,65"),
                new Payment("4539253088200", "10/4/2019", "€7,86"),
                new Payment("4485106532400", "17/1/2020", "€3,01"),
                new Payment("4916992852049", "11/1/2020", "€8,99"),
                new Payment("4485 295 29 8284", "11/1/2020", "€9,95"),
                new Payment("402 40071 23026 162", "29/1/2020", "€16,13"),
                new Payment("4532 516 20 1165", "30/4/2019", "€16,32"),
                new Payment("4774 311 05 7836", "20/8/2019", "€13,87"),
                new Payment("4539177615377", "26/4/2019", "€8,30"),
                new Payment("492907 9034084834", "14/1/2020", "€12,19"),
                new Payment("4916172180179", "20/1/2020", "€17,35"),
                new Payment("4716 4998 2656 4636", "20/4/2020", "€0,72"),
                new Payment("4485231179917916", "30/4/2019", "€0,20"),
                new Payment("448570 543947 5567", "17/4/2019", "€17,10"),
                new Payment("4485877926641", "14/11/2020", "€0,21"),
                new Payment("4556299197761", "10/11/2020", "€11,00"),
                new Payment("4485171518099648", "25/1/2020", "€3,58"),
                new Payment("448575 4766634818", "14/1/2020", "€16,30"),
                new Payment("453993 9934228769", "10/4/2019", "€9,72"),
                new Payment("4485869492081", "10/1/2020", "€2,92"),
                new Payment("448 52641 55611 419", "24/2/2029", "€20,32"),
                new Payment("4539 450 98 4383", "04/4/2019", "€10,48"),
                new Payment("4556292663546", "13/1/2020", "€17,36"),
                new Payment("402400 7160718705", "25/1/2020", "€11,23"),
                new Payment("4485 6579 5203 2202", "30/4/2019", "€8,56"),
                new Payment("4929 960 64 1401", "19/4/2019", "€18,70"),
                new Payment("4539 468 11 0344", "29/5/2020", "€14,16"),
                new Payment("4156673583012255", "04/1/2020", "€17,08"),
                new Payment("4916764727106", "19/1/2020", "€4,55"),
                new Payment("4716 007 67 6171", "16/4/2019", "€5,21"),
                new Payment("471677 7783695075", "04/1/2020", "€8,95"),
                new Payment("402400 719572 8612", "03/4/2020", "€2,08"),
                new Payment("448 55971 74746 389", "15/4/2019", "€5,66"),
                new Payment("4532 431 80 8367", "19/4/2019", "€14,01"),
                new Payment("4916195882920658", "12/1/2020", "€15,33"),
                new Payment("448555 9336788204", "20/8/2019", "€1,45"),
                new Payment("4716 005 22 8967", "21/1/2020", "€8,92"),
                new Payment("4556567796104", "14/4/2019", "€15,95"),
                new Payment("4532648803938", "17/4/2020", "€8,82"),
                new Payment("4929068289756", "09/9/2020", "€18,66"),
                new Payment("491 60389 27851 845", "04/1/2020", "€0,95"),
                new Payment("4556 6797 8186 8907", "28/1/2020", "€2,17"),
                new Payment("4916 079 12 0302", "03/4/2020", "€10,50"),
                new Payment("4532818232484380", "30/4/2019", "€5,27"),
                new Payment("4716 098 06 4428", "15/4/2019", "€4,72"),
                new Payment("433 12308 28988 068", "25/1/2020", "€3,27"),
                new Payment("4485 9986 8575 9715", "17/4/2020", "€12,44"),
                new Payment("431758 968755 7035", "27/4/2019", "€14,26"),
                new Payment("4024007141802172", "12/4/2019", "€5,78"),
                new Payment("4532 994 69 1044", "16/1/2020", "€1,27"),
                new Payment("4716 098 06 4428", "25/7/2019", "€14,73"),
                new Payment("4556179867791024", "19/1/2020", "€8,85"),
                new Payment("4929340409776", "09/1/2020", "€8,16"),
                new Payment("471683 482879 6705", "22/4/2019", "€13,08"),
                new Payment("4539 947 95 2415", "20/4/2020", "€10,34"),
                new Payment("4485981091750833", "30/1/2020", "€16,14"),
                new Payment("402400 716412 1088", "28/1/2020", "€14,08"),
                new Payment("448 52641 55611 419", "24/4/2019", "€13,64"),
                new Payment("4973093149759", "20/1/2020", "€5,41"),
                new Payment("455615 2993896876", "10/4/2019", "€17,95"),
                new Payment("4716296270265060", "26/1/2020", "€10,19"),
                new Payment("4740 821 27 6471", "25/1/2020", "€4,02"),
                new Payment("4929606666424", "16/1/2020", "€13,25"),
                new Payment("4567 447 18 2555", "27/4/2019", "€11,11"),
                new Payment("4532650092123", "20/4/2019", "€16,36"),
                new Payment("4716 645 56 7873", "19/1/2020", "€11,04"),
                new Payment("4916 6960 1364 2988", "17/4/2020", "€17,35"),
                new Payment("4539 539 33 7231", "25/1/2020", "€0,80"),
                new Payment("4024 007 12 3157", "26/4/2019", "€4,09"),
                new Payment("4024 007 12 3157", "13/4/2019", "€17,04"),
                new Payment("4532156455501", "16/4/2019", "€9,54"),
                new Payment("4485537648940", "18/1/2020", "€9,45"),
                new Payment("471678 3799090319", "29/1/2020", "€18,43"),
                new Payment("4485610322843", "28/4/2019", "€3,13"),
                new Payment("471633 9162809890", "21/4/2020", "€11,50"),
                new Payment("4539 268 18 0406", "19/1/2020", "€10,84"),
                new Payment("4716341690490", "31/1/2020", "€4,55"),
                new Payment("4485 888 17 6533", "02/1/2020", "€4,02"),
                new Payment("471651 5861267650", "24/4/2019", "€7,37"),
                new Payment("4716 013 15 1490", "20/4/2019", "€9,77"),
                new Payment("4556968342391", "20/4/2019", "€6,43"),
                new Payment("453 23693 13072 603", "14/1/2020", "€3,16"),
                new Payment("471649982656 4636", "11/5/2019", "€0,72"),
                new Payment("471 65446 43426 996", "07/1/2020", "€2,80"),
                new Payment("448576 9234247787", "14/4/2019", "€11,10"),
                new Payment("4556173734507", "18/4/2019", "€11,12"),
                new Payment("402400 715554 8182", "10/4/2019", "€10,90")
        };

        double loopSum = loopSum(payments);
        System.out.println("Sum using Loops: " + loopSum);

        double recursionSum = recursionSum(payments, 0, 0);
        System.out.println("Sum using Recursions: " + recursionSum);
        //		System.out.println("Payments: " + Arrays.toString(payments));

        List<String> arrayList = new ArrayList<String>();
        String recursionDuplicate = recursionDuplicate(payments, 0, arrayList);
        System.out.println(recursionDuplicate);
    }

    // First you program the functions with loops
    // Then you'll have to use recursion to solve it
    private static double loopSum(Payment[] payments) {
        double sum = 0;
        for (int i = 0; i < payments.length; i++) {
            sum = sum + Double.parseDouble(payments[i].getAmount().substring(1).replace(",", "."));
        }
        return sum;
    }

    private static double recursionSum(Payment[] payments, int i, double n) {
        if (i != payments.length) {
            return recursionSum(payments, i + 1, n + Double.parseDouble(payments[i].getAmount().substring(1).replace(",", ".")));
        }
        return n;
    }

    private static String recursionDuplicate(Payment[] payments, int i, List<String> duplicates) {
        if (i != payments.length) {
            String temp = payments[i].getCardnumber().replaceAll("\\s+","");
            int amnt = 0;
            for(int j = 0; j < payments.length; j++) {
                if (temp.equals(payments[j].getCardnumber().replaceAll("\\s+",""))) {
                    amnt = amnt + 1;
                    System.out.println(amnt);
                }
                if (amnt >= 2) {
                    System.out.println("Duplicate Detected " + payments[i].getCardnumber());
                    duplicates.add(payments[j].getCardnumber().replaceAll("\\s+",""));
                    amnt = 0;
                }
                if (j == payments.length - 1) {
                    amnt = 0;
                }
            }
            return recursionDuplicate(payments, i + 1, duplicates);
        }

        return duplicates.stream().distinct().collect(Collectors.joining());
    }
}
