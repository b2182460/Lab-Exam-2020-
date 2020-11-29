package csv;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        var users = new UserCsvReader().readUserCsv("users.csv");
        List<String> lowerCaseUsers = new ArrayList<String>();

        users.stream().filter(user -> user.getCode().startsWith("m")).forEach( user -> lowerCaseUsers.add(user.getName().toLowerCase()));
        System.out.println(lowerCaseUsers.stream().sorted((s1,s2) -> s1.compareTo(s2)).collect(Collectors.toList()));
        // TODO Q2.1

    }
}
