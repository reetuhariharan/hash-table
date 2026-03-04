public class Main {

    public static void main(String[] args) {

        DNSCache dns = new DNSCache();

        dns.addEntry("google.com", "172.217.14.206");

        System.out.println(dns.resolve("google.com"));
        System.out.println(dns.resolve("facebook.com"));

    }
}