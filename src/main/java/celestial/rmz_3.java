/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.exceptions.AuthenticationUnavailableException
 */
package celestial;

import celestial.rgn_3;
import celestial.rmQ_2;
import celestial.rmW_2;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.UUID;

public class rmz_3
extends Thread {
    public final /* synthetic */ String id_class;
    public final /* synthetic */ rmW_2 id_break;

    public rmz_3(rmW_2 rmW_22, String string, String string2) {
        this.id_break = rmW_22;
        this.id_class = string2;
        super(string);
    }

    @Override
    public void run() {
        GameProfile gameProfile = this.id_break.id_implements;
        try {
            this.id_break.id_implements = this.id_break.id_case.Z().hasJoinedServer(new GameProfile((UUID)null, gameProfile.getName()), this.id_class, this.id_class());
            if (this.id_break.id_implements != null) {
                rmW_2.id_byte.info("UUID of player {} is {}", (Object)this.id_break.id_implements.getName(), (Object)this.id_break.id_implements.getId());
                this.id_break.id_catch = rmQ_2.READY_TO_ACCEPT;
            } else if (this.id_break.id_case.id_const()) {
                rmW_2.id_byte.warn("Failed to verify username but will let them in anyway!");
                this.id_break.id_implements = this.id_break.id_class(gameProfile);
                this.id_break.id_catch = rmQ_2.READY_TO_ACCEPT;
            } else {
                this.id_break.id_class(new rgn_3("multiplayer.disconnect.unverified_username"));
                rmW_2.id_byte.error("Username '{}' tried to join with an invalid session", (Object)gameProfile.getName());
            }
        }
        catch (AuthenticationUnavailableException authenticationUnavailableException) {
            if (this.id_break.id_case.id_const()) {
                rmW_2.id_byte.warn("Authentication servers are down but will let them in anyway!");
                this.id_break.id_implements = this.id_break.id_class(gameProfile);
                this.id_break.id_catch = rmQ_2.READY_TO_ACCEPT;
            }
            this.id_break.id_class(new rgn_3("multiplayer.disconnect.authservers_down"));
            rmW_2.id_byte.error("Couldn't verify username because servers are unavailable");
        }
    }

    private InetAddress id_class() {
        SocketAddress socketAddress = this.id_break.id_class.id_byte();
        return this.id_break.id_case.S() && socketAddress instanceof InetSocketAddress ? ((InetSocketAddress)socketAddress).getAddress() : null;
    }
}

