package celestial;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.io.Files;
import com.mojang.authlib.Agent;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rCE {
   static final Logger throws_ = LogManager.getLogger();
   public static final File class_ = new File("banned-ips.txt");
   public static final File break_ = new File("banned-players.txt");
   public static final File byte_ = new File("ops.txt");
   public static final File protected_ = new File("white-list.txt");

   public static boolean byte_(rnW_2 var0) {
      rna_3 var1 = new rna_3(rCr_1.byte_);
      if (byte_.exists() && byte_.isFile()) {
         if (var1.break_().exists()) {
            try {
               var1.case_();
            } catch (IOException var6) {
               throws_.warn("Could not load existing file {}", var1.break_().getName(), var6);
            }
         }

         try {
            List var2 = Files.readLines(byte_, StandardCharsets.UTF_8);
            rCb_1 var3 = new rCb_1(var0, var1);
            class_(var0, var2, var3);
            var1.throws_();
            break_(byte_);
            return true;
         } catch (IOException var4) {
            throws_.warn("Could not read old oplist to convert it!", var4);
            return false;
         } catch (rCX var5) {
            throws_.error("Conversion failed, please try again later", var5);
            return false;
         }
      } else {
         return true;
      }
   }

   static List<String> class_(File var0, Map<String, String[]> var1) throws IOException {
      List var2 = Files.readLines(var0, StandardCharsets.UTF_8);

      for (String var4 : var2) {
         var4 = var4.trim();
         if (!var4.startsWith("#") && var4.length() >= 1) {
            String[] var5 = var4.split("\\|");
            var1.put(var5[0].toLowerCase(Locale.ROOT), var5);
         }
      }

      return var2;
   }

   private static boolean class_() {
      boolean var0 = false;
      if (break_.exists() && break_.isFile()) {
         var0 = true;
      }

      boolean var1 = false;
      if (class_.exists() && class_.isFile()) {
         var1 = true;
      }

      boolean var2 = false;
      if (byte_.exists() && byte_.isFile()) {
         var2 = true;
      }

      boolean var3 = false;
      if (protected_.exists() && protected_.isFile()) {
         var3 = true;
      }

      if (!var0 && !var1 && !var2 && !var3) {
         return true;
      } else {
         throws_.warn("**** FAILED TO START THE SERVER AFTER ACCOUNT CONVERSION!");
         throws_.warn("** please remove the following files and restart the server:");
         if (var0) {
            throws_.warn("* {}", break_.getName());
         }

         if (var1) {
            throws_.warn("* {}", class_.getName());
         }

         if (var2) {
            throws_.warn("* {}", byte_.getName());
         }

         if (var3) {
            throws_.warn("* {}", protected_.getName());
         }

         return false;
      }
   }

   static Date class_(String var0, Date var1) {
      Date var2;
      try {
         var2 = rnY_2.class_.parse(var0);
      } catch (ParseException var4) {
         var2 = var1;
      }

      return var2;
   }

   static void class_(File var0) {
      if (var0.exists()) {
         if (!var0.isDirectory()) {
            throw new rCX("Can't create directory " + var0.getName() + " in world save directory.");
         }
      } else if (!var0.mkdirs()) {
         throw new rCX("Can't create directory " + var0.getName() + " in world save directory.");
      }
   }

   private static void class_(rnW_2 var0, Collection<String> var1, ProfileLookupCallback var2) {
      String[] var3 = var1.stream().filter(var0x -> !rql_3.break_(var0x)).toArray(String[]::new);
      if (var0.B()) {
         var0.v().findProfilesByNames(var3, Agent.MINECRAFT, var2);
      } else {
         for (String var7 : var3) {
            UUID var8 = rhd_3.class_(new GameProfile((UUID)null, var7));
            GameProfile var9 = new GameProfile(var8, var7);
            var2.onProfileLookupSucceeded(var9);
         }
      }
   }

   public static boolean class_(rnW_2 var0) {
      rno_3 var1 = new rno_3(rCr_1.class_);
      if (break_.exists() && break_.isFile()) {
         if (var1.break_().exists()) {
            try {
               var1.case_();
            } catch (IOException var6) {
               throws_.warn("Could not load existing file {}", var1.break_().getName(), var6);
            }
         }

         try {
            HashMap var2 = Maps.newHashMap();
            class_(break_, var2);
            rCG var3 = new rCG(var0, var2, var1);
            class_(var0, var2.keySet(), var3);
            var1.throws_();
            break_(break_);
            return true;
         } catch (IOException var4) {
            throws_.warn("Could not read old user banlist to convert it!", var4);
            return false;
         } catch (rCX var5) {
            throws_.error("Conversion failed, please try again later", var5);
            return false;
         }
      } else {
         return true;
      }
   }

   public static UUID class_(rnW_2 var0, String var1) {
      if (!rql_3.break_(var1) && var1.length() <= 16) {
         GameProfile var2 = var0.F().class_(var1);
         if (var2 != null && var2.getId() != null) {
            return var2.getId();
         } else if (!var0.const_() && var0.B()) {
            ArrayList var3 = Lists.newArrayList();
            rCO var4 = new rCO(var0, var3);
            class_(var0, Lists.newArrayList(new String[]{var1}), var4);
            return !var3.isEmpty() && ((GameProfile)var3.get(0)).getId() != null ? ((GameProfile)var3.get(0)).getId() : null;
         } else {
            return rhd_3.class_(new GameProfile((UUID)null, var1));
         }
      } else {
         try {
            return UUID.fromString(var1);
         } catch (IllegalArgumentException var5) {
            return null;
         }
      }
   }

   public static boolean class_(rnv_3 var0) {
      File var1 = catch_(var0);
      File var2 = new File(var1.getParentFile(), "playerdata");
      File var3 = new File(var1.getParentFile(), "unknownplayers");
      if (var1.exists() && var1.isDirectory()) {
         File[] var4 = var1.listFiles();
         ArrayList var5 = Lists.newArrayList();

         for (File var9 : var4) {
            String var10 = var9.getName();
            if (var10.toLowerCase(Locale.ROOT).endsWith(".dat")) {
               String var11 = var10.substring(0, var10.length() - ".dat".length());
               if (!var11.isEmpty()) {
                  var5.add(var11);
               }
            }
         }

         try {
            String[] var13 = var5.toArray(new String[var5.size()]);
            rCh_1 var14 = new rCh_1(var0, var2, var3, var1, var13);
            class_(var0, Lists.newArrayList(var13), var14);
            return true;
         } catch (rCX var12) {
            throws_.error("Conversion failed, please try again later", var12);
            return false;
         }
      } else {
         return true;
      }
   }

   public static boolean break_(rnW_2 var0) {
      rnU_2 var1 = new rnU_2(rCr_1.break_);
      if (class_.exists() && class_.isFile()) {
         if (var1.break_().exists()) {
            try {
               var1.case_();
            } catch (IOException var11) {
               throws_.warn("Could not load existing file {}", var1.break_().getName(), var11);
            }
         }

         try {
            HashMap var2 = Maps.newHashMap();
            class_(class_, var2);

            for (String var4 : var2.keySet()) {
               String[] var5 = (String[])var2.get(var4);
               Date var6 = var5.length > 1 ? class_(var5[1], (Date)null) : null;
               String var7 = var5.length > 2 ? var5[2] : null;
               Date var8 = var5.length > 3 ? class_(var5[3], (Date)null) : null;
               String var9 = var5.length > 4 ? var5[4] : null;
               var1.class_(new rnD_2(var4, var6, var7, var8, var9));
            }

            var1.throws_();
            break_(class_);
            return true;
         } catch (IOException var10) {
            throws_.warn("Could not parse old ip banlist to convert it!", var10);
            return false;
         }
      } else {
         return true;
      }
   }

   private static void break_(File var0) {
      File var1 = new File(var0.getName() + ".converted");
      var0.renameTo(var1);
   }

   public static boolean throws_(rnW_2 var0) {
      boolean var1 = class_();
      return var1 && case_(var0);
   }

   private static File catch_(rnW_2 var0) {
      return var0.class_(rrGr_1.protected_).toFile();
   }

   private static boolean case_(rnW_2 var0) {
      File var1 = catch_(var0);
      if (var1.exists() && var1.isDirectory() && (var1.list().length > 0 || !var1.delete())) {
         throws_.warn("**** DETECTED OLD PLAYER DIRECTORY IN THE WORLD SAVE");
         throws_.warn("**** THIS USUALLY HAPPENS WHEN THE AUTOMATIC CONVERSION FAILED IN SOME WAY");
         throws_.warn("** please restart the server and if the problem persists, remove the directory '{}'", var1.getPath());
         return false;
      } else {
         return true;
      }
   }

   public static boolean protected_(rnW_2 var0) {
      rCk_1 var1 = new rCk_1(rCr_1.protected_);
      if (protected_.exists() && protected_.isFile()) {
         if (var1.break_().exists()) {
            try {
               var1.case_();
            } catch (IOException var6) {
               throws_.warn("Could not load existing file {}", var1.break_().getName(), var6);
            }
         }

         try {
            List var2 = Files.readLines(protected_, StandardCharsets.UTF_8);
            rCM var3 = new rCM(var0, var1);
            class_(var0, var2, var3);
            var1.throws_();
            break_(protected_);
            return true;
         } catch (IOException var4) {
            throws_.warn("Could not read old whitelist to convert it!", var4);
            return false;
         } catch (rCX var5) {
            throws_.error("Conversion failed, please try again later", var5);
            return false;
         }
      } else {
         return true;
      }
   }
}
