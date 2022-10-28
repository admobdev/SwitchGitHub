public class case9 {
    public static void main(String[] args) {
        //Kun, Oy
        //31.12 -> 01.01
        //30.12 -> 31.12
        //5, 5 -> 06.05
        //28, 2 -> 01.03
        //16, 4 -> 17.04
        //35, 3 -> Bunday kun yo'q
        //21, 14 -> Bunday kun yo'q

        int day = 31; //Kun
        int month = 12; //Oy
        final int MAX_MONTHS = 12; //Umumiy oylar soni

        if (month > MAX_MONTHS || day > 31)
            System.out.println("Bunday sana yo'q");
        else {
            String result = "";
            int numberOfDays = 0; //Oydagi kunlar soni
            switch (day) {
                case 28:
                    numberOfDays = 28;
                    if (month == 2)
                        result += "01.";
                    else
                        result += (++day) + ".";
                    break;
                case 30:
                    numberOfDays = 30;
                    if (month == 4 || month == 6 || month == 9 || month == 11)
                        result += "01.";
                    else
                        result += (++day) + ".";
                    break;
                case 31:
                    numberOfDays = 31;
                    if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
                        result += "01.";
                    else
                        result += (++day) + ".";
                    break;
                default:
                    if(String.valueOf(day).length() == 1)
                        result += "0" + (++day) + ".";
                    else
                        result += (++day) + ".";
                    break;
            }
            if(day == numberOfDays)
                month++;

            if(month > MAX_MONTHS){
                result += "01";
            }
            else{
                if(String.valueOf(month).length() == 1)
                    result += "0" + month;
                else
                    result += month;
            }
            System.out.println(result);
        }
    }
}