/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public class KK {
    private final String id_class;
    private final String id_break;

    public KK(String string, Object object) {
        this.id_class = string;
        if (object == null) {
            this.id_break = "~~NULL~~";
        } else if (object instanceof Throwable) {
            Throwable throwable = (Throwable)object;
            this.id_break = "~~ERROR~~ " + throwable.getClass().getSimpleName() + ": " + throwable.getMessage();
        } else {
            this.id_break = object.toString();
        }
    }

    public String id_class() {
        return this.id_class;
    }

    public String id_break() {
        return this.id_break;
    }
}

