package celestial;

import com.google.common.collect.Lists;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CompletionException;
import java.util.stream.Collectors;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class KY {
   private static final Logger id_class = LogManager.getLogger();
   private final String id_break;
   private final Throwable id_byte;
   private final Ko_1 id_protected = new Ko_1(this, "System Details");
   private final List<Ko_1> id_throws = Lists.newArrayList();
   private File id_case;
   private boolean id_catch = true;
   private StackTraceElement[] id_private = new StackTraceElement[0];
   private boolean id_implements = false;

   public String id_byte() {
      StringWriter var1 = null;
      PrintWriter var2 = null;
      Object var3 = this.id_byte;
      if (var3.getMessage() == null) {
         if (var3 instanceof NullPointerException) {
            var3 = new NullPointerException(this.id_break);
         } else if (var3 instanceof StackOverflowError) {
            var3 = new StackOverflowError(this.id_break);
         } else if (var3 instanceof OutOfMemoryError) {
            var3 = new OutOfMemoryError(this.id_break);
         }

         var3.setStackTrace(this.id_byte.getStackTrace());
      }

      if (rrxr_3.id_public.id_byte()) {
         return rrxr_3.id_public.id_case(var3);
      } else {
         String var4;
         try {
            var1 = new StringWriter();
            var2 = new PrintWriter(var1);
            var3.printStackTrace(var2);
            var4 = var1.toString();
         } finally {
            IOUtils.closeQuietly(var1);
            IOUtils.closeQuietly(var2);
         }

         return var4;
      }
   }

   public KY(String var1, Throwable var2) {
      this.id_break = var1;
      this.id_byte = var2;
      this.id_private();
   }

   public boolean id_class(File var1) {
      if (this.id_case != null) {
         return false;
      } else {
         if (var1.getParentFile() != null) {
            var1.getParentFile().mkdirs();
         }

         OutputStreamWriter var2 = null;

         boolean var3;
         try {
            var2 = new OutputStreamWriter(new FileOutputStream(var1), StandardCharsets.UTF_8);
            var2.write(this.id_protected());
            this.id_case = var1;
            return true;
         } catch (Throwable var8) {
            id_class.error("Could not save crash report to {}", var1, var8);
            var3 = false;
         } finally {
            IOUtils.closeQuietly(var2);
         }

         return var3;
      }
   }

   public Ko_1 id_class(String var1) {
      return this.id_class(var1, 1);
   }

   public String id_class() {
      return this.id_break;
   }

   public static KY id_class(Throwable var0, String var1) {
      while (var0 instanceof CompletionException && var0.getCause() != null) {
         var0 = var0.getCause();
      }

      KY var2;
      if (var0 instanceof KU) {
         var2 = ((KU)var0).id_class();
      } else {
         var2 = new KY(var1, var0);
      }

      return var2;
   }

   public Ko_1 id_class(String var1, int var2) {
      Ko_1 var3 = new Ko_1(this, var1);

      try {
         if (this.id_catch) {
            int var4 = var3.id_class(var2);
            StackTraceElement[] var5 = this.id_byte.getStackTrace();
            StackTraceElement var6 = null;
            StackTraceElement var7 = null;
            int var8 = var5.length - var4;
            if (var8 < 0) {
               System.out.println("Negative index in crash report handler (" + var5.length + "/" + var4 + ")");
            }

            if (var5 != null && 0 <= var8 && var8 < var5.length) {
               var6 = var5[var8];
               if (var5.length + 1 - var4 < var5.length) {
                  var7 = var5[var5.length + 1 - var4];
               }
            }

            this.id_catch = var3.id_class(var6, var7);
            if (var4 > 0 && !this.id_throws.isEmpty()) {
               Ko_1 var9 = this.id_throws.get(this.id_throws.size() - 1);
               var9.id_break(var4);
            } else if (var5 != null && var5.length >= var4 && 0 <= var8 && var8 < var5.length) {
               this.id_private = new StackTraceElement[var8];
               System.arraycopy(var5, 0, this.id_private, 0, this.id_private.length);
            } else {
               this.id_catch = false;
            }
         }
      } catch (Throwable var10) {
         var10.printStackTrace();
      }

      this.id_throws.add(var3);
      return var3;
   }

   public void id_class(StringBuilder var1) {
      if ((this.id_private == null || this.id_private.length <= 0) && !this.id_throws.isEmpty()) {
         this.id_private = (StackTraceElement[])ArrayUtils.subarray(this.id_throws.get(0).id_class(), 0, 1);
      }

      if (this.id_private != null && this.id_private.length > 0) {
         var1.append("-- Head --\n");
         var1.append("Thread: ").append(Thread.currentThread().getName()).append("\n");
         if (rrxr_3.id_goto.id_byte()) {
            var1.append("Stacktrace:");
            var1.append(rrxr_3.id_goto.id_case(this.id_private));
         } else {
            var1.append("Stacktrace:\n");

            for (StackTraceElement var5 : this.id_private) {
               var1.append("\t").append("at ").append(var5);
               var1.append("\n");
            }

            var1.append("\n");
         }
      }

      for (Ko_1 var7 : this.id_throws) {
         var7.id_class(var1);
         var1.append("\n\n");
      }

      this.id_protected.id_class(var1);
   }

   public Throwable id_break() {
      return this.id_byte;
   }

   public File id_throws() {
      return this.id_case;
   }

   public static void id_catch() {
      new KY("Don't panic!", new Throwable()).id_protected();
   }

   public Ko_1 id_case() {
      return this.id_protected;
   }

   private static String id_implements() {
      String[] var0 = new String[]{
         "Who set us up the TNT?",
         "Everything's going to plan. No, really, that was supposed to happen.",
         "Uh... Did I do that?",
         "Oops.",
         "Why did you do that?",
         "I feel sad now :(",
         "My bad.",
         "I'm sorry, Dave.",
         "I let you down. Sorry :(",
         "On the bright side, I bought you a teddy bear!",
         "Daisy, daisy...",
         "Oh - I know what I did wrong!",
         "Hey, that tickles! Hehehe!",
         "I blame Dinnerbone.",
         "You should try our sister game, Minceraft!",
         "Don't be sad. I'll do better next time, I promise!",
         "Don't be sad, have a hug! <3",
         "I just don't know what went wrong :(",
         "Shall we play a game?",
         "Quite honestly, I wouldn't worry myself about that.",
         "I bet Cylons wouldn't have this problem.",
         "Sorry :(",
         "Surprise! Haha. Well, this is awkward.",
         "Would you like a cupcake?",
         "Hi. I'm Minecraft, and I'm a crashaholic.",
         "Ooh. Shiny.",
         "This doesn't make any sense!",
         "Why is it breaking :(",
         "Don't do that.",
         "Ouch. That hurt :(",
         "You're mean.",
         "This is a token for 1 free hug. Redeem at your nearest Mojangsta: [~~HUG~~]",
         "There are four lights!",
         "But it works on my machine."
      };

      try {
         return var0[(int)(rqR_2.id_byte() % (long)var0.length)];
      } catch (Throwable var2) {
         return "Witty comment unavailable :(";
      }
   }

   public String id_protected() {
      if (!this.id_implements) {
         this.id_implements = true;
         rrbd_3.id_class(this, this.id_protected);
      }

      StringBuilder var1 = new StringBuilder();
      var1.append("---- Minecraft Crash Report ----\n");
      if (rrxr_3.id_return != null && rrxr_3.id_return.id_byte()) {
         rrxr_3.id_return.id_class(var1, this);
      }

      var1.append("// ");
      var1.append(id_implements());
      var1.append("\n\n");
      var1.append("Time: ");
      var1.append(new SimpleDateFormat().format(new Date()));
      var1.append("\n");
      var1.append("Description: ");
      var1.append(this.id_break);
      var1.append("\n\n");
      var1.append(this.id_byte());
      var1.append("\n\nA detailed walkthrough of the error, its code path and all known details is as follows:\n");

      for (int var2 = 0; var2 < 87; var2++) {
         var1.append("-");
      }

      var1.append("\n\n");
      this.id_class(var1);
      return var1.toString();
   }

   private void id_private() {
      this.id_protected.id_class("Minecraft Version", () -> rqu_3.id_class().getName());
      this.id_protected.id_class("Minecraft Version ID", () -> rqu_3.id_class().getId());
      this.id_protected
         .id_class(
            "Operating System", () -> System.getProperty("os.name") + " (" + System.getProperty("os.arch") + ") version " + System.getProperty("os.version")
         );
      this.id_protected.id_class("Java Version", () -> System.getProperty("java.version") + ", " + System.getProperty("java.vendor"));
      this.id_protected
         .id_class(
            "Java VM Version",
            () -> System.getProperty("java.vm.name") + " (" + System.getProperty("java.vm.info") + "), " + System.getProperty("java.vm.vendor")
         );
      this.id_protected.id_class("Memory", () -> {
         Runtime var0 = Runtime.getRuntime();
         long var1 = var0.maxMemory();
         long var3 = var0.totalMemory();
         long var5 = var0.freeMemory();
         long var7 = var1 / 1024L / 1024L;
         long var9 = var3 / 1024L / 1024L;
         long var11 = var5 / 1024L / 1024L;
         return var5 + " bytes (" + var11 + " MB) / " + var3 + " bytes (" + var9 + " MB) up to " + var1 + " bytes (" + var7 + " MB)";
      });
      this.id_protected.id_class("CPUs", Runtime.getRuntime().availableProcessors());
      this.id_protected.id_class("JVM Flags", () -> {
         List var0 = rqR_2.id_finally().collect(Collectors.toList());
         return String.format("%d total; %s", var0.size(), var0.stream().collect(Collectors.joining(" ")));
      });
      if (rrxr_3.id_synchronized != null) {
         rrxr_3.id_synchronized.id_class(this, this.id_protected);
      }
   }
}
