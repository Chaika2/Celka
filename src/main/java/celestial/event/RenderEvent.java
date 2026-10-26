/*
 * Decompiled with CFR 0.152.
 */
package celestial.event;

import celestial.Ml_1;
import celestial.rjV_2;
import celestial.rrQX;

public class RenderEvent {
    public Object[] id_class = new Object[]{null, null, Float.valueOf(0.0f)};
    public static Object[] id_break = new Object[]{new RenderEvent()};

    public float id_byte() {
        return ((Float)this.id_class[2]).floatValue();
    }

    public RenderEvent() {
        this.id_implements();
    }

    public Ml_1 id_class() {
        return (Ml_1)this.id_class[0];
    }

    public static void id_class(Ml_1 var0, rjV_2 var1, float var2) {
        RenderEvent var3 = RenderEvent.id_break(var0, var1, var2);
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(var3);
    }

    public rjV_2 id_break() {
        return (rjV_2)this.id_class[1];
    }

    public static RenderEvent id_break(Ml_1 var0, rjV_2 var1, float var2) {
        ((RenderEvent)RenderEvent.id_break[0]).id_class[0] = var0;
        ((RenderEvent)RenderEvent.id_break[0]).id_class[1] = var1;
        ((RenderEvent)RenderEvent.id_break[0]).id_class[2] = Float.valueOf(var2);
        return (RenderEvent)id_break[0];
    }

    private void id_implements() {
        if (this.id_class == null) {
            this.id_class = new Object[3];
            this.id_class[2] = Float.valueOf(0.0f);
        }
    }
}

