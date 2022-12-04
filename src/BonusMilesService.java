public class BonusMilesService {
    public int calculate(int cost) {
        int miles;
        int mile = 20;
        miles = cost / mile;
        return miles;
    }
}