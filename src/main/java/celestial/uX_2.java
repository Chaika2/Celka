/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public interface uX_2 {
    default public float id_class(boolean bl) {
        return this.getAdvance() + (bl ? this.id_case() : 0.0f);
    }

    default public float id_throws() {
        return 0.0f;
    }

    default public float id_catch() {
        return 1.0f;
    }

    default public float id_case() {
        return 1.0f;
    }

    public float getAdvance();
}

