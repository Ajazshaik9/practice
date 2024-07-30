import java.util.Random;
import java.util.UUID;

public class OTP {
    public static void main(String[] args) {
        String sampleOTP = UUID.randomUUID().toString();
        System.out.println(sampleOTP.substring(0,6));
        int otpLength = 4; // length of the OTP

        String otp = generateOTP(otpLength);
        System.out.println("Your OTP is: " + otp);
        Archer[] archers = {
                new Archer("Robin Hood", 30),
                new Archer("Legolas", 100),
                new Archer("Katniss Everdeen", 25),
                new Archer("Hawkeye", 35)
        };

        Random random = new Random();
        Archer randomArcher = archers[random.nextInt(archers.length)];

        System.out.println("Random archer selected:");
        System.out.println("Name: " + randomArcher.getName());
        System.out.println("Age: " + randomArcher.getAge());
    }

    private static String generateOTP(int otpLength) {
        // Define the character set for the OTP
        String charSet = "0123456789";

        // Create an instance of Random class
        Random random = new Random();

        // Create a StringBuilder object to store the OTP
        StringBuilder otp = new StringBuilder(otpLength);

        // Generate random OTP digits and append them to the StringBuilder object
        for (int i = 0; i < otpLength; i++) {
            int index = random.nextInt(charSet.length());
            otp.append(charSet.charAt(index));
        }

        return otp.toString();
    }

    public static class Archer {
        private String name;
        private int age;
        public Archer(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public String getName() {
            return name;
        }
        public int getAge() {
            return age;
        }
    }

}
