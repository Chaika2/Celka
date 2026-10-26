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
   static final Logger id_throws = LogManager.getLogger();
   public static final File id_class = new File("banned-ips.txt");
   public static final File id_break = new File("banned-players.txt");
   public static final File id_byte = new File("ops.txt");
   public static final File id_protected = new File("white-list.txt");

   public static boolean id_byte(rnW_2 var0) {
      rna_3 var1 = new rna_3(rCr_1.id_byte);
      if (id_byte.exists() && id_byte.isFile()) {
         if (var1.id_break().exists()) {
            try {
               var1.id_case();
            } catch (IOException var6) {
               id_throws.warn("Could not load existing file {}", var1.id_break().getName(), var6);
            }
         }

         try {
            List var2 = Files.readLines(id_byte, StandardCharsets.UTF_8);
            rCb_1 var3 = new rCb_1(var0, var1);
            id_class(var0, var2, var3);
            var1.id_throws();
            id_break(id_byte);
            return true;
         } catch (IOException var4) {
            id_throws.warn("Could not read old oplist to convert it!", var4);
            return false;
         } catch (rCX var5) {
            id_throws.error("Conversion failed, please try again later", var5);
            return false;
         }
      } else {
         return true;
      }
   }

   static List<String> id_class(File var0, Map<String, String[]> var1) throws IOException {
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

   private static boolean id_class() {
      boolean var0 = false;
      if (id_break.exists() && id_break.isFile()) {
         var0 = true;
      }

      boolean var1 = false;
      if (id_class.exists() && id_class.isFile()) {
         var1 = true;
      }

      boolean var2 = false;
      if (id_byte.exists() && id_byte.isFile()) {
         var2 = true;
      }

      boolean var3 = false;
      if (id_protected.exists() && id_protected.isFile()) {
         var3 = true;
      }

      if (!var0 && !var1 && !var2 && !var3) {
         return true;
      } else {
         id_throws.warn("**** FAILED TO START THE SERVER AFTER ACCOUNT CONVERSION!");
         id_throws.warn("** please remove the following files and restart the server:");
         if (var0) {
            id_throws.warn("* {}", id_break.getName());
         }

         if (var1) {
            id_throws.warn("* {}", id_class.getName());
         }

         if (var2) {
            id_throws.warn("* {}", id_byte.getName());
         }

         if (var3) {
            id_throws.warn("* {}", id_protected.getName());
         }

         return false;
      }
   }

   static Date id_class(String var0, Date var1) {
      Date var2;
      try {
         var2 = rnY_2.id_class.parse(var0);
      } catch (ParseException var4) {
         var2 = var1;
      }

      return var2;
   }

   static void id_class(File var0) {
      if (var0.exists()) {
         if (!var0.isDirectory()) {
            throw new rCX("Can't create directory " + var0.getName() + " in world save directory.");
         }
      } else if (!var0.mkdirs()) {
         throw new rCX("Can't create directory " + var0.getName() + " in world save directory.");
      }
   }

   private static void id_class(rnW_2 var0, Collection<String> var1, ProfileLookupCallback var2) {
      String[] var3 = var1.stream().filter(var0x -> !rql_3.id_break(var0x)).toArray(String[]::new);
      if (var0.B()) {
         var0.v().findProfilesByNames(var3, Agent.MINECRAFT, var2);
      } else {
         for (String var7 : var3) {
            UUID var8 = rhd_3.id_class(new GameProfile((UUID)null, var7));
            GameProfile var9 = new GameProfile(var8, var7);
            var2.onProfileLookupSucceeded(var9);
         }
      }
   }

   public static boolean id_class(rnW_2 var0) {
      rno_3 var1 = new rno_3(rCr_1.id_class);
      if (id_break.exists() && id_break.isFile()) {
         if (var1.id_break().exists()) {
            try {
               var1.id_case();
            } catch (IOException var6) {
               id_throws.warn("Could not load existing file {}", var1.id_break().getName(), var6);
            }
         }

         try {
            HashMap var2 = Maps.newHashMap();
            id_class(id_break, var2);
            rCG var3 = new rCG(var0, var2, var1);
            id_class(var0, var2.keySet(), var3);
            var1.id_throws();
            id_break(id_break);
            return true;
         } catch (IOException var4) {
            id_throws.warn("Could not read old user banlist to convert it!", var4);
            return false;
         } catch (rCX var5) {
            id_throws.error("Conversion failed, please try again later", var5);
            return false;
         }
      } else {
         return true;
      }
   }

   public static UUID id_class(rnW_2 var0, String var1) {
      if (!rql_3.id_break(var1) && var1.length() <= 16) {
         GameProfile var2 = var0.F().id_class(var1);
         if (var2 != null && var2.getId() != null) {
            return var2.getId();
         } else if (!var0.id_const() && var0.B()) {
            ArrayList var3 = Lists.newArrayList();
            rCO var4 = new rCO(var0, var3);
            id_class(var0, Lists.newArrayList(new String[]{var1}), var4);
            return !var3.isEmpty() && ((GameProfile)var3.get(0)).getId() != null ? ((GameProfile)var3.get(0)).getId() : null;
         } else {
            return rhd_3.id_class(new GameProfile((UUID)null, var1));
         }
      } else {
         try {
            return UUID.fromString(var1);
         } catch (IllegalArgumentException var5) {
            return null;
         }
      }
   }

   public static boolean id_class(rnv_3 var0) {
      File var1 = id_catch(var0);
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
            id_class(var0, Lists.newArrayList(var13), var14);
            return true;
         } catch (rCX var12) {
            id_throws.error("Conversion failed, please try again later", var12);
            return false;
         }
      } else {
         return true;
      }
   }

   public static boolean id_break(rnW_2 var0) {
      rnU_2 var1 = new rnU_2(rCr_1.id_break);
      if (id_class.exists() && id_class.isFile()) {
         if (var1.id_break().exists()) {
            try {
               var1.id_case();
            } catch (IOException var11) {
               id_throws.warn("Could not load existing file {}", var1.id_break().getName(), var11);
            }
         }

         try {
            HashMap var2 = Maps.newHashMap();
            id_class(id_class, var2);

            for (String var4 : var2.keySet()) {
               String[] var5 = (String[])var2.get(var4);
               Date var6 = var5.length > 1 ? id_class(var5[1], (Date)null) : null;
               String var7 = var5.length > 2 ? var5[2] : null;
               Date var8 = var5.length > 3 ? id_class(var5[3], (Date)null) : null;
               String var9 = var5.length > 4 ? var5[4] : null;
               var1.id_class(new rnD_2(var4, var6, var7, var8, var9));
            }

            var1.id_throws();
            id_break(id_class);
            return true;
         } catch (IOException var10) {
            id_throws.warn("Could not parse old ip banlist to convert it!", var10);
            return false;
         }
      } else {
         return true;
      }
   }

   private static void id_break(File var0) {
      File var1 = new File(var0.getName() + ".converted");
      var0.renameTo(var1);
   }

   public static boolean id_throws(rnW_2 var0) {
      boolean var1 = id_class();
      return var1 && id_case(var0);
   }

   private static File id_catch(rnW_2 var0) {
      return var0.id_class(rrGr_1.id_protected).toFile();
   }

   private static boolean id_case(rnW_2 var0) {
      File var1 = id_catch(var0);
      if (var1.exists() && var1.isDirectory() && (var1.list().length > 0 || !var1.delete())) {
         id_throws.warn("**** DETECTED OLD PLAYER DIRECTORY IN THE WORLD SAVE");
         id_throws.warn("**** THIS USUALLY HAPPENS WHEN THE AUTOMATIC CONVERSION FAILED IN SOME WAY");
         id_throws.warn("** please restart the server and if the problem persists, remove the directory '{}'", var1.getPath());
         return false;
      } else {
         return true;
      }
   }

   public static boolean id_protected(rnW_2 var0) {
      rCk_1 var1 = new rCk_1(rCr_1.id_protected);
      if (id_protected.exists() && id_protected.isFile()) {
         if (var1.id_break().exists()) {
            try {
               var1.id_case();
            } catch (IOException var6) {
               id_throws.warn("Could not load existing file {}", var1.id_break().getName(), var6);
            }
         }

         try {
            List var2 = Files.readLines(id_protected, StandardCharsets.UTF_8);
            rCM var3 = new rCM(var0, var1);
            id_class(var0, var2, var3);
            var1.id_throws();
            id_break(id_protected);
            return true;
         } catch (IOException var4) {
            id_throws.warn("Could not read old whitelist to convert it!", var4);
            return false;
         } catch (rCX var5) {
            id_throws.error("Conversion failed, please try again later", var5);
            return false;
         }
      } else {
         return true;
      }
   }
}
