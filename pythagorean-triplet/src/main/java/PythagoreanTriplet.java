import java.util.Objects;
import java.util.*;
import static java.lang.Math.*;
public class PythagoreanTriplet {
    private final int A,B,C;
    public PythagoreanTriplet(int a, int b, int c) {
        A = a;
        B = b;
        C = c;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PythagoreanTriplet)) return false;
        PythagoreanTriplet object = (PythagoreanTriplet) o;
        return A == object.A &&
                B == object.B &&
                C == object.C;
    }

    public static PythagoreanTripletBuilder makeTripletsList() {
        return new PythagoreanTripletBuilder();
    }
    public static class PythagoreanTripletBuilder {
        private int limit = 0, sum = 0;
        public PythagoreanTripletBuilder withFactorsLessThanOrEqualTo(int limit) {
            this.limit = limit;
            return this;
        }
        public PythagoreanTripletBuilder thatSumTo(int sum) {
            this.sum = sum;
            return this;
        }
        public List<PythagoreanTriplet> build() {
            List<PythagoreanTriplet> list = new ArrayList<>();
            for (int A = 1; A< limit; A++) {
                int squaredA = (int) pow(A, 2);
                for (int B = A; B < limit ; B++) {
                    int C= sum - (A + B);
                    if (B > C) break;
                    int squaredB = (int) pow(B, 2);
                    int squaredC = (int) pow(C, 2);
                    if (squaredA + squaredB == squaredC) {
                        list.add(new PythagoreanTriplet(A,B,C));
                    }
                }
            }
            return list;
        }
    }

}