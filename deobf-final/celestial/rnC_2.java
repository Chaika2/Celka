package celestial;

import com.google.common.collect.Streams;
import java.io.File;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.stream.Collectors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rnC_2 implements Runnable {
   private static final Logger class_ = LogManager.getLogger();
   private final rnv_3 break_;
   private final long byte_;

   public rnC_2(rnv_3 var1) {
      this.break_ = var1;
      this.byte_ = var1.rO();
   }

   @Override
   public void run() {
      while (this.break_.synchronized_()) {
         long var1 = this.break_.q();
         long var3 = rqR_2.break_();
         long var5 = var3 - var1;
         if (var5 > this.byte_) {
            class_.fatal(
               "A single server tick took {} seconds (should be max {})",
               String.format(Locale.ROOT, "%.2f", (float)var5 / 1000.0F),
               String.format(Locale.ROOT, "%.2f", 0.05F)
            );
            class_.fatal("Considering it to be crashed, server will forcibly shutdown.");
            ThreadMXBean var7 = ManagementFactory.getThreadMXBean();
            ThreadInfo[] var8 = var7.dumpAllThreads(true, true);
            StringBuilder var9 = new StringBuilder();
            Error var10 = new Error("Watchdog");

            for (ThreadInfo var14 : var8) {
               if (var14.getThreadId() == this.break_.P().getId()) {
                  var10.setStackTrace(var14.getStackTrace());
               }

               var9.append(var14);
               var9.append("\n");
            }

            KY var16 = new KY("Watching Server", var10);
            this.break_.break_(var16);
            Ko_1 var17 = var16.class_("Thread Dump");
            var17.class_("Threads", var9);
            Ko_1 var18 = var16.class_("Performance stats");
            var18.class_("Random tick rate", () -> this.break_.rB().finally_().class_(rRu_1.volatile_).toString());
            var18.class_("Level stats", () -> Streams.stream(this.break_.float_()).map(var0 -> var0.E() + ": " + var0.N()).collect(Collectors.joining(",\n")));
            rVN.class_("Crash report:\n" + var16.protected_());
            File var19 = new File(
               new File(this.break_.instanceof_(), "crash-reports"), "crash-" + new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date()) + "-server.txt"
            );
            if (var16.class_(var19)) {
               class_.error("This crash report has been saved to: {}", var19.getAbsolutePath());
            } else {
               class_.error("We were unable to save this crash report to disk.");
            }

            this.class_();
         }

         try {
            Thread.sleep(var1 + this.byte_ - var3);
         } catch (InterruptedException var15) {
         }
      }
   }

   private void class_() {
      try {
         java.util.Timer var1 = new java.util.Timer();
         var1.schedule(new rnl_3(this), 10000L);
         System.exit(1);
      } catch (Throwable var2) {
         Runtime.getRuntime().halt(1);
      }
   }
}
