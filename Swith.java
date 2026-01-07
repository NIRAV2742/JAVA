class Switch {
    public static void main(String[] args) {
        String day = "sun";
        
        // The switch expression returns a String to 'r'
        String r = switch(day) {
            case "mon" -> "Monday";
            case "tue" -> "Tuesday";
            case "wed" -> "Wednesday";
            case "thu" -> "Thursday";
            case "fri" -> "Friday";
            case "sat" -> "Saturday";
            case "sun" -> "Sunday";
            default    -> "Invalid day"; // Switch expressions must be exhaustive
        };
        
        System.out.println(r);
    }
}