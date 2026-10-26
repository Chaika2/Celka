/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Streams
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.KY;
import celestial.Ko_1;
import celestial.rRu_1;
import celestial.rVN;
import celestial.rnl_3;
import celestial.rnv_3;
import celestial.rqR_2;
import com.google.common.collect.Streams;
import java.io.File;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.stream.Collectors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rnC_2
implements Runnable {
    private static final Logger id_class = LogManager.getLogger();
    private final rnv_3 id_break;
    private final long id_byte;

    public rnC_2(rnv_3 rnv_32) {
        this.id_break = rnv_32;
        this.id_byte = rnv_32.rO();
    }

    @Override
    public void run() {
        while (this.id_break.id_synchronized()) {
            long l = this.id_break.q();
            long l2 = rqR_2.id_break();
            long l3 = l2 - l;
            if (l3 > this.id_byte) {
                id_class.fatal("A single server tick took {} seconds (should be max {})", (Object)String.format(Locale.ROOT, "%.2f", Float.valueOf((float)l3 / 1000.0f)), (Object)String.format(Locale.ROOT, "%.2f", Float.valueOf(0.05f)));
                id_class.fatal("Considering it to be crashed, server will forcibly shutdown.");
                ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
                ThreadInfo[] threadInfoArray = threadMXBean.dumpAllThreads(true, true);
                StringBuilder stringBuilder = new StringBuilder();
                Error error = new Error("Watchdog");
                for (ThreadInfo threadInfo : threadInfoArray) {
                    if (threadInfo.getThreadId() == this.id_break.P().getId()) {
                        error.setStackTrace(threadInfo.getStackTrace());
                    }
                    stringBuilder.append(threadInfo);
                    stringBuilder.append("\n");
                }
                KY kY = new KY("Watching Server", error);
                this.id_break.id_break(kY);
                Ko_1 ko_1 = kY.id_class("Thread Dump");
                ko_1.id_class("Threads", stringBuilder);
                Ko_1 ko_12 = kY.id_class("Performance stats");
                ko_12.id_class("Random tick rate", () -> this.id_break.rB().id_finally().id_class(rRu_1.id_volatile).toString());
                ko_12.id_class("Level stats", () -> Streams.stream(this.id_break.id_float()).map(rrEm_12 -> rrEm_12.E() + ": " + rrEm_12.N()).collect(Collectors.joining(",\n")));
                rVN.id_class("Crash report:\n" + kY.id_protected());
                File object2 = new File(new File(this.id_break.id_instanceof(), "crash-reports"), "crash-" + new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date()) + "-server.txt");
                if (kY.id_class(object2)) {
                    id_class.error("This crash report has been saved to: {}", (Object)object2.getAbsolutePath());
                } else {
                    id_class.error("We were unable to save this crash report to disk.");
                }
                this.id_class();
            }
            try {
                Thread.sleep(l + this.id_byte - l2);
            }
            catch (InterruptedException interruptedException) {}
        }
    }

    private void id_class() {
        try {
            Timer timer = new Timer();
            timer.schedule((TimerTask)new rnl_3(this), 10000L);
            System.exit(1);
        }
        catch (Throwable throwable) {
            Runtime.getRuntime().halt(1);
        }
    }
}

