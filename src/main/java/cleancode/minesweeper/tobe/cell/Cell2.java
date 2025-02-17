package cleancode.minesweeper.tobe.cell;

public abstract class Cell2 {
    private static final String FLAG_SIGN = "⚑";
    private static final String LAND_MINE_SIGN = "☼";
    private static final String EMPTY_SIGN = "■";
    private static final String UNCHECKED_SIGN = "□";

    private int nearbyLandMineCount;
    private boolean isLandMine;
    private boolean isFlagged;
    private boolean isOpened;
    //Cell이 가진 속성 : 근처 지뢰 숫자, 지뢰 여부
    //Cell의 상태 : 깃발 유무, 열렸다/닫혔다, 사용자가 확인함

    public abstract void turnOnLandMine();

    public abstract void updateNearbyLandMineCount(int count);

    public void flag() {
        this.isFlagged = true;
    }

    public void open() {
        this.isOpened = true;
    }


    public boolean isChecked() {
        return isFlagged || isOpened;
    }

    public abstract boolean isLandMine();

    public boolean isOpened() {
        return isOpened;
    }

    public abstract boolean hasLandMineCount();

    public abstract String getSign();
}
