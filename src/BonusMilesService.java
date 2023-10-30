public class BonusMilesService {
    public int calculate(int price) {
        int bonusMile = 20;
        int mile = price / bonusMile;
        return mile;
    }
}
