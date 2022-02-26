package rajesh.kushwaha.dates

class App {

    static void main(String[] args) {
        String format = 'MM/dd/yyyy'

        Scanner scanner= new Scanner(System.in)

        // Error handling ommited for brevity...

        print "Enter First Date $format: "
        Date date1= Date.parse(format, scanner.next())

        print "Enter Second Date $format: "
        Date date2= Date.parse(format, scanner.next())

        def duration =(date2-date1)

        println "Duration: $duration"
    }
}
