public class Main {

    public static void main(String[] args) {
        MultiLevelCache cache = new MultiLevelCache();

        cache.addVideo("video1", "Movie Data");

        System.out.println(cache.getVideo("video1"));
        System.out.println(cache.getVideo("video1"));
    }
    }
