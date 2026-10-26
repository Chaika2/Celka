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
   private static final Logger class_ = LogManager.getLogger();
   private final String break_;
   private final Throwable byte_;
   private final Ko_1 protected_ = new Ko_1(this, "System Details");
   private final List<Ko_1> throws_ = Lists.newArrayList();
   private File case_;
   private boolean catch_ = true;
   private StackTraceElement[] private_ = new StackTraceElement[0];
   private boolean implements_ = false;

   public String byte_() {
      StringWriter var1 = null;
      PrintWriter var2 = null;
      Object var3 = this.byte_;
      if (var3.getMessage() == null) {
         if (var3 instanceof NullPointerException) {
            var3 = new NullPointerException(this.break_);
         } else if (var3 instanceof StackOverflowError) {
            var3 = new StackOverflowError(this.break_);
         } else if (var3 instanceof OutOfMemoryError) {
            var3 = new OutOfMemoryError(this.break_);
         }

         var3.setStackTrace(this.byte_.getStackTrace());
      }

      if (rrxr_3.public_.byte_()) {
         return rrxr_3.public_.case_(var3);
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
      this.break_ = var1;
      this.byte_ = var2;
      this.private_();
   }

   public boolean class_(File var1) {
      if (this.case_ != null) {
         return false;
      } else {
         if (var1.getParentFile() != null) {
            var1.getParentFile().mkdirs();
         }

         OutputStreamWriter var2 = null;

         boolean var3;
         try {
            var2 = new OutputStreamWriter(new FileOutputStream(var1), StandardCharsets.UTF_8);
            var2.write(this.protected_());
            this.case_ = var1;
            return true;
         } catch (Throwable var8) {
            class_.error("Could not save crash report to {}", var1, var8);
            var3 = false;
         } finally {
            IOUtils.closeQuietly(var2);
         }

         return var3;
      }
   }

   public Ko_1 class_(String var1) {
      return this.class_(var1, 1);
   }

   public String class_() {
      return this.break_;
   }

   public static KY class_(Throwable var0, String var1) {
      while (var0 instanceof CompletionException && var0.getCause() != null) {
         var0 = var0.getCause();
      }

      KY var2;
      if (var0 instanceof KU) {
         var2 = ((KU)var0).class_();
      } else {
         var2 = new KY(var1, var0);
      }

      return var2;
   }

   public Ko_1 class_(String var1, int var2) {
      Ko_1 var3 = new Ko_1(this, var1);

      try {
         if (this.catch_) {
            int var4 = var3.class_(var2);
            StackTraceElement[] var5 = this.byte_.getStackTrace();
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

            this.catch_ = var3.class_(var6, var7);
            if (var4 > 0 && !this.throws_.isEmpty()) {
               Ko_1 var9 = this.throws_.get(this.throws_.size() - 1);
               var9.break_(var4);
            } else if (var5 != null && var5.length >= var4 && 0 <= var8 && var8 < var5.length) {
               this.private_ = new StackTraceElement[var8];
               System.arraycopy(var5, 0, this.private_, 0, this.private_.length);
            } else {
               this.catch_ = false;
            }
         }
      } catch (Throwable var10) {
         var10.printStackTrace();
      }

      this.throws_.add(var3);
      return var3;
   }

   public void class_(StringBuilder var1) {
      if ((this.private_ == null || this.private_.length <= 0) && !this.throws_.isEmpty()) {
         this.private_ = (StackTraceElement[])ArrayUtils.subarray(this.throws_.get(0).class_(), 0, 1);
      }

      if (this.private_ != null && this.private_.length > 0) {
         var1.append("-- Head --\n");
         var1.append("Thread: ").append(Thread.currentThread().getName()).append("\n");
         if (rrxr_3.goto_.byte_()) {
            var1.append("Stacktrace:");
            var1.append(rrxr_3.goto_.case_(this.private_));
         } else {
            var1.append("Stacktrace:\n");

            for (StackTraceElement var5 : this.private_) {
               var1.append("\t").append("at ").append(var5);
               var1.append("\n");
            }

            var1.append("\n");
         }
      }

      for (Ko_1 var7 : this.throws_) {
         var7.class_(var1);
         var1.append("\n\n");
      }

      this.protected_.class_(var1);
   }

   public Throwable break_() {
      return this.byte_;
   }

   public File throws_() {
      return this.case_;
   }

   public static void catch_() {
      new KY("Don't panic!", new Throwable()).protected_();
   }

   public Ko_1 case_() {
      return this.protected_;
   }

   private static String implements_() {
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
         return var0[(int)(rqR_2.byte_() % (long)var0.length)];
      } catch (Throwable var2) {
         return "Witty comment unavailable :(";
      }
   }

   public String protected_() {
      if (!this.implements_) {
         this.implements_ = true;
         rrbd_3.class_(this, this.protected_);
      }

      StringBuilder var1 = new StringBuilder();
      var1.append("---- Minecraft Crash Report ----\n");
      if (rrxr_3.return_ != null && rrxr_3.return_.byte_()) {
         rrxr_3.return_.class_(var1, this);
      }

      var1.append("// ");
      var1.append(implements_());
      var1.append("\n\n");
      var1.append("Time: ");
      var1.append(new SimpleDateFormat().format(new Date()));
      var1.append("\n");
      var1.append("Description: ");
      var1.append(this.break_);
      var1.append("\n\n");
      var1.append(this.byte_());
      var1.append("\n\nA detailed walkthrough of the error, its code path and all known details is as follows:\n");

      for (int var2 = 0; var2 < 87; var2++) {
         var1.append("-");
      }

      var1.append("\n\n");
      this.class_(var1);
      return var1.toString();
   }

   private void private_() {
      this.protected_.class_("Minecraft Version", () -> rqu_3.class_().getName());
      this.protected_.class_("Minecraft Version ID", () -> rqu_3.class_().getId());
      this.protected_
         .class_(
            "Operating System", () -> System.getProperty("os.name") + " (" + System.getProperty("os.arch") + ") version " + System.getProperty("os.version")
         );
      this.protected_.class_("Java Version", () -> System.getProperty("java.version") + ", " + System.getProperty("java.vendor"));
      this.protected_
         .class_(
            "Java VM Version",
            () -> System.getProperty("java.vm.name") + " (" + System.getProperty("java.vm.info") + "), " + System.getProperty("java.vm.vendor")
         );
      this.protected_.class_("Memory", () -> {
         Runtime var0 = Runtime.getRuntime();
         long var1 = var0.maxMemory();
         long var3 = var0.totalMemory();
         long var5 = var0.freeMemory();
         long var7 = var1 / 1024L / 1024L;
         long var9 = var3 / 1024L / 1024L;
         long var11 = var5 / 1024L / 1024L;
         return var5 + " bytes (" + var11 + " MB) / " + var3 + " bytes (" + var9 + " MB) up to " + var1 + " bytes (" + var7 + " MB)";
      });
      this.protected_.class_("CPUs", Runtime.getRuntime().availableProcessors());
      this.protected_.class_("JVM Flags", () -> {
         List var0 = rqR_2.finally_().collect(Collectors.toList());
         return String.format("%d total; %s", var0.size(), var0.stream().collect(Collectors.joining(" ")));
      });
      if (rrxr_3.synchronized_ != null) {
         rrxr_3.synchronized_.class_(this, this.protected_);
      }
   }
}
