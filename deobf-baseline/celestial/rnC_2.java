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
   private static final Logger id_class = LogManager.getLogger();
   private final rnv_3 id_break;
   private final long id_byte;

   public rnC_2(rnv_3 var1) {
      this.id_break = var1;
      this.id_byte = var1.rO();
   }

   @Override
   public void run() {
      while (this.id_break.id_synchronized()) {
         long var1 = this.id_break.q();
         long var3 = rqR_2.id_break();
         long var5 = var3 - var1;
         if (var5 > this.id_byte) {
            id_class.fatal(
               "A single server tick took {} seconds (should be max {})",
               String.format(Locale.ROOT, "%.2f", (float)var5 / 1000.0F),
               String.format(Locale.ROOT, "%.2f", 0.05F)
            );
            id_class.fatal("Considering it to be crashed, server will forcibly shutdown.");
            ThreadMXBean var7 = ManagementFactory.getThreadMXBean();
            ThreadInfo[] var8 = var7.dumpAllThreads(true, true);
            StringBuilder var9 = new StringBuilder();
            Error var10 = new Error("Watchdog");

            for (ThreadInfo var14 : var8) {
               if (var14.getThreadId() == this.id_break.P().getId()) {
                  var10.setStackTrace(var14.getStackTrace());
               }

               var9.append(var14);
               var9.append("\n");
            }

            KY var16 = new KY("Watching Server", var10);
            this.id_break.id_break(var16);
            Ko_1 var17 = var16.id_class("Thread Dump");
            var17.id_class("Threads", var9);
            Ko_1 var18 = var16.id_class("Performance stats");
            var18.id_class("Random tick rate", () -> this.id_break.rB().id_finally().id_class(rRu_1.id_volatile).toString());
            var18.id_class(
               "Level stats", () -> Streams.stream(this.id_break.id_float()).map(var0 -> var0.E() + ": " + var0.N()).collect(Collectors.joining(",\n"))
            );
            rVN.id_class("Crash report:\n" + var16.id_protected());
            File var19 = new File(
               new File(this.id_break.id_instanceof(), "crash-reports"),
               "crash-" + new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date()) + "-server.txt"
            );
            if (var16.id_class(var19)) {
               id_class.error("This crash report has been saved to: {}", var19.getAbsolutePath());
            } else {
               id_class.error("We were unable to save this crash report to disk.");
            }

            this.id_class();
         }

         try {
            Thread.sleep(var1 + this.id_byte - var3);
         } catch (InterruptedException var15) {
         }
      }
   }

   private void id_class() {
      try {
         java.util.Timer var1 = new java.util.Timer();
         var1.schedule(new rnl_3(this), 10000L);
         System.exit(1);
      } catch (Throwable var2) {
         Runtime.getRuntime().halt(1);
      }
   }
}
