/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.protocol.version.BaseVersionProvider
 */
package celestial;

import celestial.rrjA_2;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.protocol.version.BaseVersionProvider;
import offline.launcher.ViaProtocolCompat;

public class rrjY_2
extends BaseVersionProvider {
    public ProtocolVersion getClosestServerProtocol(UserConnection userConnection) throws Exception {
        if (userConnection.isClientSide()) {
            return ViaProtocolCompat.logHandshakeTarget(ProtocolVersion.getProtocol((int)rrjA_2.id_protected().id_throws().getVersion()));
        }
        return ViaProtocolCompat.logHandshakeTarget(super.getClosestServerProtocol(userConnection));
    }
}

