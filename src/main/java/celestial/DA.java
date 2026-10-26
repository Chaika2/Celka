/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Stopwatch
 *  com.google.common.collect.Lists
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.DT;
import celestial.Dn_1;
import celestial.rVN;
import com.google.common.base.Stopwatch;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DA {
    private static final Logger id_class = LogManager.getLogger();
    private final Collection<Path> id_break;
    private final Path id_byte;
    private final List<DT> id_protected = Lists.newArrayList();

    public void id_byte() throws IOException {
        Dn_1 dn_1 = new Dn_1(this.id_byte, "cache");
        dn_1.id_byte(this.id_break().resolve("version.json"));
        Stopwatch stopwatch = Stopwatch.createStarted();
        Stopwatch stopwatch2 = Stopwatch.createUnstarted();
        for (DT dT : this.id_protected) {
            id_class.info("Starting provider: {}", (Object)dT.id_class());
            stopwatch2.start();
            dT.id_class(dn_1);
            stopwatch2.stop();
            id_class.info("{} finished after {} ms", (Object)dT.id_class(), (Object)stopwatch2.elapsed(TimeUnit.MILLISECONDS));
            stopwatch2.reset();
        }
        id_class.info("All providers took: {} ms", (Object)stopwatch.elapsed(TimeUnit.MILLISECONDS));
        dn_1.id_class();
    }

    public DA(Path path, Collection<Path> collection) {
        this.id_byte = path;
        this.id_break = collection;
    }

    static {
        rVN.id_class();
    }

    public void id_class(DT dT) {
        this.id_protected.add(dT);
    }

    public Collection<Path> id_class() {
        return this.id_break;
    }

    public Path id_break() {
        return this.id_byte;
    }
}

