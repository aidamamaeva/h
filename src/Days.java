public enum Days {
    MON("понедельник"), TUE("вторник"), WEN("среда"),THU("четверг"), FRI("пятница"),SAT("суббта"),SUN("воскресенье");
    private String translation;
    Days(String translation){
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }
}

