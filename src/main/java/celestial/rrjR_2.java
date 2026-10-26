/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.platform.ViaPlatformLoader
 *  com.viaversion.viaversion.api.platform.providers.Provider
 *  com.viaversion.viaversion.api.platform.providers.ViaProviders
 *  com.viaversion.viaversion.api.protocol.version.VersionProvider
 *  com.viaversion.viaversion.protocols.v1_8to1_9.provider.MovementTransmitterProvider
 */
package celestial;

import celestial.rrjA_2;
import celestial.rrjY_2;
import celestial.rrjf_3;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.platform.ViaPlatformLoader;
import com.viaversion.viaversion.api.platform.providers.Provider;
import com.viaversion.viaversion.api.platform.providers.ViaProviders;
import com.viaversion.viaversion.api.protocol.version.VersionProvider;
import com.viaversion.viaversion.protocols.v1_8to1_9.provider.MovementTransmitterProvider;

public class rrjR_2
implements ViaPlatformLoader {
    public void load() {
        ViaProviders viaProviders = Via.getManager().getProviders();
        viaProviders.use(VersionProvider.class, (Provider)new rrjY_2());
        viaProviders.use(MovementTransmitterProvider.class, (Provider)new rrjf_3());
        if (rrjA_2.id_protected().id_private() != null) {
            rrjA_2.id_protected().id_private().accept(viaProviders);
        }
    }

    public void unload() {
    }
}

