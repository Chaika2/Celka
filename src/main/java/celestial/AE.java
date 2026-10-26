/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.QY;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.main.Main;

public class AE
extends Thread {
    public final /* synthetic */ QY id_class;

    public AE(String string, QY qY) {
        this.id_class = qY;
        super(string);
    }

    @Override
    public void run() {
        try {
            RenderSystem.initGameThread(true);
            this.id_class.id_double();
        }
        catch (Throwable throwable) {
            Main.id_class.error("Exception in client thread", throwable);
        }
    }
}

