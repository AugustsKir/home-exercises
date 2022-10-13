package streams.practice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

/**
 * TODO - search for StreamsExerciseTest and make all tests pass
 */
public class StreamsExercise {
    public static List<Integer> returnSquareRoot(List<Integer> numbers) {
        return numbers.stream().map(Math::sqrt).map(Double::intValue).toList();
    }

    public static List<Integer> getAgeFromUsers(List<User> user) {
        return user.stream().map(User::getAge).toList();
    }

    public static List<Integer> getDistinctAges(List<User> users) {
        return users.stream().map(User::getAge).toList().stream().distinct().toList();
    }

    public static List<User> getLimitedUserList(List<User> users, int limit) {
        return users.stream().limit(limit).toList();
    }

    public static Integer countUsersOlderThen25(List<User> users) {
        return Math.toIntExact(users.stream().map(User::getAge).filter(age -> age > 25).count());
    }

    public static List<String> mapToUpperCase(List<String> strings) {
        return strings.stream().map(String::toUpperCase).toList();
    }

    public static Integer sum(List<Integer> integers) {
        return integers.stream().mapToInt(Integer::intValue).sum();
    }

    public static List<Integer> skip(List<Integer> integers, Integer toSkip) {
        return integers.stream().skip(toSkip).toList();
    }

    public static List<String> getFirstNames(List<String> names) {
        return names.stream().map(n -> n.split(" ")).map(n -> n[0]).toList();
    }

    public static List<String> getDistinctLetters(List<String> names) {
        return names.stream().map(c -> c.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList());
    }


    public static String separateNamesByComma(List<User> users) {
        String str = users.stream().map(User::getName).toList().toString();
        return str.substring(1, str.length() - 1);
    }

    public static double getAverageAge(List<User> users) {
        return (double) users.stream().map(User::getAge).mapToInt(Integer::intValue).sum() / users.size();
    }

    public static Integer getMaxAge(List<User> users) {
        return users.stream().map(User::getAge).mapToInt(Integer::intValue).max().getAsInt();
    }

    public static Integer getMinAge(List<User> users) {
        return users.stream().map(User::getAge).mapToInt(Integer::intValue).min().getAsInt();
    }

    public static Map<Boolean, List<User>> partionUsersByGender(List<User> users) {
        return users.stream().collect(groupingBy(User::isMale));
    }

    public static Map<Integer, List<User>> groupByAge(List<User> users) {
        return users.stream().collect(groupingBy(User::getAge));
    }

    public static Map<Boolean, Map<Integer, List<User>>> groupByGenderAndAge(List<User> users) {
        return users.stream().collect(Collectors.groupingBy(User::isMale, Collectors.groupingBy(User::getAge)));
    }

    public static Map<Boolean, Long> countGender(List<User> users) {
        return users.stream().collect(groupingBy(User::isMale, counting()));
    }

    public static boolean anyMatch(List<User> users, int age) {
        return users.stream().map(User::getAge).anyMatch(user -> user == age);
    }

    public static boolean noneMatch(List<User> users, int age) {
        return users.stream().map(User::getAge).noneMatch(user -> user == age);
    }

    public static Optional<User> findAny(List<User> users, String name) {
        return users.stream().filter(n -> n.getName().equals(name)).findAny();
    }

    public static List<User> sortByAge(List<User> users) {
        return users.stream().sorted(Comparator.comparing(User::getAge)).collect(toList());
    }

    public static Stream<Integer> getBoxedStream(IntStream stream) {
        return stream.boxed();
    }

    public static List<Integer> generateFirst10PrimeNumbers() {
        return IntStream.rangeClosed(2, 100).filter(StreamsExercise::isPrime).limit(10).boxed().collect(toList());
    }

    public static boolean isPrime(int number) {
        return IntStream.rangeClosed(2, number / 2).noneMatch(i -> number % i == 0);
    }

    public static List<Integer> generate10RandomNumbers() {
        List<Integer> random = new Random().ints(1, 999999)
                .distinct()
                .limit(10)
                .boxed().toList();
        return random;
    }

    public static User findOldest(List<User> users) {
        return users.stream().max(Comparator.comparingInt(User::getAge)).get();
    }

    public static int sumAge(List<User> users) {
        return users.stream().map(User::getAge).mapToInt(Integer::intValue).sum();
    }

    public static IntSummaryStatistics ageSummaryStatistics(List<User> users) {
        IntSummaryStatistics out = users.stream().map(User::getAge).mapToInt(Integer::intValue).summaryStatistics();
        return out;
    }
}
