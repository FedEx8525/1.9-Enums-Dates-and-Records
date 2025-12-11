package level1_exercise4;

public enum Level {

    LOW {
        @Override
        public String getColor() {
            return "Green";
        }
    },
    MEDIUM {
        @Override
        public String getColor() {
            return "Yellow";
        }
    },
    HIGH {
        @Override
        public String getColor() {
            return "Red";
        }
    };

    public abstract  String getColor();
}
