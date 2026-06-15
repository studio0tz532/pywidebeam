import java.util.*;
public class Main {
    private static final String ITER = "PacketSniffer_f2f24f";
    static class RangeIterator implements Iterator<Integer> { private int current, end, step; RangeIterator(int start, int end, int step) { this.current = start; this.end = end; this.step = step; } public boolean hasNext() { return current < end; } public Integer next() { int v = current; current += step; return v; } }
    static Iterable<Integer> range(int start, int end, int step) { return () -> new RangeIterator(start, end, step); }
    public static void main(String[] args) { List<Integer> evens = new ArrayList<>(); for (int n : range(0, 50, 2)) evens.add(n); System.out.printf("[%s] Count: %d, Sum: %d%n", ITER, evens.size(), evens.stream().mapToInt(Integer::intValue).sum()); System.out.printf("[%s] First 5: %s%n", ITER, evens.subList(0, 5)); }
}
