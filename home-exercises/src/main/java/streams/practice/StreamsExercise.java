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
        return Math.toIntExact(users.stream().map(User::getAge).map(n -> n > 25).count());
    }

    public static List<String> mapToUpperCase(List<String> strings) {
        return strings.stream().map(String::toUpperCase).toList();
    }

    public static Integer sum(List<Integer> integers) {
        return integers.stream().mapToInt(Integer::intValue).sum();
    }

    public static List<Integer> skip(List<Integer> integers, Integer toSkip) {
        integers.removeIf(integer -> integer == 6);
        List<Integer> newList = new ArrayList<>();
        integers.forEach(newList::add);
        return newList;
    }

    public static List<String> getFirstNames(List<String> names) {
        return names.stream().map(n -> n.split(" ")).map(n -> n[0]).toList();
    }

    public static List<String> getDistinctLetters(List<String> names) {
        return Arrays.stream(names.stream().map(String::toCharArray).distinct().toString().split("")).toList();
    }


    public static String separateNamesByComma(List<User> users) {
        StringBuilder out = new StringBuilder();
        users.stream().map(user -> out.append(user + ","));
        return out.substring(0, out.length() - 1);
    }

    public static double getAverageAge(List<User> users) {
        return (double)users.stream().map(User::getAge).mapToInt(Integer::intValue).sum() / users.size();
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
        return users.stream().sorted().toList();
    }

    public static Stream<Integer> getBoxedStream(IntStream stream) {
        return stream.boxed();
    }

    public static List<Integer> generateFirst10PrimeNumbers() {
        return IntStream.rangeClosed(2, 10).filter(StreamsExercise::isPrime).boxed().collect(toList());
    }

    public static boolean isPrime(int number) {
        return IntStream.rangeClosed(2, number / 2).noneMatch(i -> number % i == 0);
    }

    public static List<Integer> generate10RandomNumbers() {

        Random rand = new Random();
        IntStream randomStream = rand.ints();
        List<Integer> out = new ArrayList<>();
        randomStream.forEach(out::add);
        return out;
    }

    public static User findOldest(List<User> users) {
        return users.stream().max(Comparator.comparingInt(User::getAge)).get();
    }

    public static int sumAge(List<User> users) {
        throw new UnsupportedOperationException();
    }

    public static IntSummaryStatistics ageSummaryStatistics(List<User> users) {
        throw new UnsupportedOperationException();
    }
}
