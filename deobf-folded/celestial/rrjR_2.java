package celestial;

import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.platform.ViaPlatformLoader;
import com.viaversion.viaversion.api.platform.providers.ViaProviders;
import com.viaversion.viaversion.api.protocol.version.VersionProvider;
import com.viaversion.viaversion.protocols.v1_8to1_9.provider.MovementTransmitterProvider;

public class rrjR_2 implements ViaPlatformLoader {
   public void load() {
      ViaProviders var1 = Via.getManager().getProviders();
      var1.use(VersionProvider.class, new rrjY_2());
      var1.use(MovementTransmitterProvider.class, new rrjf_3());
      if (rrjA_2.id_protected().id_private() != null) {
         rrjA_2.id_protected().id_private().accept(var1);
      }
   }

   public void unload() {
   }
}
