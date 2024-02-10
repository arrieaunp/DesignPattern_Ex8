public class Reporter extends Source {
    String scoreLine;
    public void setScoreLine(String scoreStr) {
        scoreLine = scoreStr;
        notifyObservers();
    }
    public String getScoreLine() {
        return scoreLine;
    }
}
