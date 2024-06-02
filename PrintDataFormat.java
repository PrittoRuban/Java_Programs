class PrintDataFormat {
    public static void main(String[] args) {
        String date = "04-06-2017"; // replace with input
        String[] parts = date.split("-");
        String format = "";
        int countOfTwoDigitParts = 0;
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        for (String part : parts) {
            switch (part.length()) {
                case 4 -> format += "YYYY-";
                case 3 -> format += "MMM-";
                case 2 -> {
                    format += "XX-";
                    countOfTwoDigitParts++;
                }
                default -> {
                }
            }
        }

        if (countOfTwoDigitParts == 2) {
            for (String month : months) {
                if (date.contains(month)) {
                    format = format.replaceFirst("XX", "MMM");
                    break;
                }
            }
            if (format.contains("XX")) {
                System.out.println(-1);
                return;
            }
        }
        System.out.println(format.substring(0, format.length() - 1).replace("XX", "DD"));
    }
}