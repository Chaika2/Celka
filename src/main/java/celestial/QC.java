/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.bridge.game.GameSession
 */
package celestial;

import celestial.Aq_1;
import celestial.Aw_1;
import celestial.cb_3;
import celestial.gm_3;
import com.mojang.bridge.game.GameSession;
import java.util.UUID;

public class QC
implements GameSession {
    private final int id_class;
    private final boolean id_break;
    private final String id_byte;
    private final String id_protected;
    private final UUID id_throws;

    public QC(gm_3 gm_32, cb_3 cb_32, Aq_1 aq_1) {
        this.id_class = aq_1.id_throws().size();
        this.id_break = !aq_1.id_class().id_protected();
        this.id_byte = gm_32.id_abstract().id_byte();
        Aw_1 aw_1 = aq_1.id_class(cb_32.ro());
        this.id_protected = aw_1 != null ? aw_1.id_break().id_break() : "unknown";
        this.id_throws = aq_1.id_volatile();
    }

    public UUID getSessionId() {
        return this.id_throws;
    }

    public String getDifficulty() {
        return this.id_byte;
    }

    public int getPlayerCount() {
        return this.id_class;
    }

    public String getGameMode() {
        return this.id_protected;
    }

    public boolean isRemoteServer() {
        return this.id_break;
    }
}

