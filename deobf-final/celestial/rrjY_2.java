package celestial;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.protocol.version.BaseVersionProvider;
import offline.launcher.ViaProtocolCompat;

public class rrjY_2 extends BaseVersionProvider {
   public ProtocolVersion getClosestServerProtocol(UserConnection var1) throws Exception {
      return var1.isClientSide()
         ? ViaProtocolCompat.logHandshakeTarget(ProtocolVersion.getProtocol(rrjA_2.protected_().throws_().getVersion()))
         : ViaProtocolCompat.logHandshakeTarget(super.getClosestServerProtocol(var1));
   }
}
