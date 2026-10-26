package celestial;

import com.google.gson.JsonObject;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.io.FilenameUtils;

public class rrwY_2 implements rrZS<rrwR_2> {
   public Object[] id_break;
   private static String[] id_byte;
   private static byte[] id_protected;
   private static boolean[] id_throws;
   private static short[] id_case;

   @Override
   public boolean id_byte(String var1, boolean var2) {
      rrwR_2 var3 = this.id_break(var1);
      boolean var4 = id_throws[11];
      if (var3 == null) {
         var3 = new rrwR_2(var1);
         ((Map)this.id_break[id_case[12]]).put(var1, var3);
         var4 = true;
      }

      return this.id_break(var3, var4);
   }

   public boolean id_byte(rrwR_2 var1, boolean var2) {
      try {
         JsonObject var3 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_case[9]]).id_break().id_break(var1.id_class()).getAsJsonObject();
         if (var3 == null) {
            return id_throws[8];
         } else {
            var1.id_class(var3);
            if (var2) {
               ((List)this.id_break[2]).forEach(var1x -> var1x.id_class(var1.id_break()));
            }

            this.id_break[3] = var1;
            return true;
         }
      } catch (Exception var9) {
         return id_throws[10];
      }
   }

   public List<rrwK_2> id_byte() {
      return (List<rrwK_2>)this.id_break[2];
   }

   public void id_byte(boolean var1) {
      this.id_class(var1);
      this.id_class();
   }

   public boolean id_byte(String var1) {
      return ((Map)this.id_break[id_case[24]]).entrySet().stream().anyMatch(var1x -> ((String)var1x.getKey()).equalsIgnoreCase(var1.toLowerCase()));
   }

   public rrwY_2() {
      this.id_implements();
      HashMap var5 = new HashMap();
      this.id_break[id_case[0]] = var5;
      ArrayList var6 = new ArrayList();
      this.id_break[1] = var6;
      ArrayList var7 = new ArrayList();
      this.id_break[2] = var7;
      this.id_catch();
   }

   static {
      ntfClinit();
   }

   public boolean id_class(rrwR_2 var1) {
      return var1.id_break().equals(id_byte[3]);
   }

   @Override
   public void id_class() {
      for (rrwR_2 var2 : this.id_break()) {
         if (!((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_case[22]]).id_break().id_class(var2.id_class())) {
            this.id_class(var2, true);
         }
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1189278088;
   }

   private void id_class(rrwj_3... var1) {
      ((List)this.id_break[1]).addAll(List.of(var1));
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6293477874635692303L;
   }

   public void id_class(rrwK_2... var1) {
      ((List)this.id_break[2]).addAll(List.of(var1));
   }

   @Override
   public void id_class(boolean var1) {
      File var2 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_case[3]]).id_break().id_class(id_byte[0]);
      File[] var3 = var2.listFiles();
      if (var3 != null) {
         File[] var4 = var3;
         int var5 = var3.length;

         for (int var6 = id_throws[5]; var6 < var5; var6++) {
            File var7 = var4[var6];
            if (FilenameUtils.getExtension(var7.getName()).equals(id_byte[1].substring(1))) {
               String var8 = FilenameUtils.removeExtension(var7.getName());
               rrwR_2 var9 = new rrwR_2(var8);
               if (var1 && !((Map)this.id_break[id_case[4]]).containsKey(var8)) {
                  ((List)this.id_break[2]).forEach(var1x -> var1x.id_byte(var9.id_break()));
               }

               ((Map)this.id_break[id_case[6]]).put(var8, var9);
            }
         }
      }
   }

   @Override
   public boolean id_class(String var1, boolean var2) {
      rrwR_2 var3 = this.id_break(var1);
      if (var3 == null) {
         if (var2) {
            ((List)this.id_break[2]).forEach(var1x -> var1x.id_break(var1));
         }

         return id_throws[7];
      } else {
         return this.id_byte(var3, var2);
      }
   }

   public boolean id_class(rrwR_2 var1, boolean var2) {
      File var3 = var1.id_class();
      ((Map)this.id_break[id_case[20]]).remove(var1.id_break());
      if (var2 && !this.id_class(var1)) {
         ((List)this.id_break[2]).forEach(var1x -> var1x.id_throws(var1.id_break()));
      }

      return var3.exists() && var3.delete() ? true : id_throws[17];
   }

   @Override
   public void id_break(boolean var1) {
      for (rrwR_2 var3 : ((Map)this.id_break[id_case[8]]).values()) {
         this.id_byte(var3, var1);
      }
   }

   public rrwR_2 id_break(String var1) {
      if (((Map)this.id_break[id_case[16]]).containsKey(var1)) {
         return (rrwR_2)((Map)this.id_break[id_case[17]]).get(var1);
      } else {
         File var2 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_case[18]]).id_break().id_class(id_byte[2]);
         return new File(var2, var1 + ".celka").exists() ? new rrwR_2(var1) : null;
      }
   }

   @Override
   public boolean id_break(String var1, boolean var2) {
      rrwR_2 var3 = this.id_break(var1);
      if (var3 == null) {
         if (var2) {
            ((List)this.id_break[2]).forEach(var1x -> var1x.id_break(var1));
         }

         return id_throws[15];
      } else {
         return this.id_class(var3, var2);
      }
   }

   public boolean id_break(rrwR_2 var1, boolean var2) {
      if (var1 == null) {
         return id_throws[13];
      } else {
         JsonObject var3 = new JsonObject();
         var1.id_break(var3);
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_case[13]]).id_break().id_class(var1.id_class(), var3);
         if (var2) {
            if (!this.id_class(var1) && var1 != this.id_case()) {
               ((List)this.id_break[2]).forEach(var1x -> var1x.id_byte(var1.id_break()));
            }
         } else {
            ((List)this.id_break[2]).forEach(var1x -> var1x.id_protected(var1.id_break()));
         }

         return true;
      }
   }

   @Override
   public Collection<rrwR_2> id_break() {
      return ((Map)this.id_break[id_case[23]]).values().stream().filter(var1 -> !this.id_class(var1) ? true : id_throws[20]).toList();
   }

   public Map<String, rrwR_2> id_throws() {
      return (Map<String, rrwR_2>)this.id_break[id_case[27]];
   }

   private static void id_finally() {
      id_case = new short[]{0, 1, 2, 0, 0, 2, 0, 2, 0, 0, 2, 3, 0, 0, 2, 2, 0, 0, 0, 2, 0, 2, 0, 0, 0, 3, 1, 0, 2, 2, 1};
   }

   private void id_catch() {
      rrwj_3[] var10001 = new rrwj_3[1];
      var10001[id_throws[1]] = new rrwD_2();
      this.id_class(var10001);
      rrwK_2[] var1 = new rrwK_2[1];
      var1[id_throws[3]] = new rrwo_3();
      this.id_class(var1);
      this.id_class(id_throws[4]);
   }

   private static void id_extends() {
      id_protected = new byte[]{4};
   }

   public rrwR_2 id_case() {
      return (rrwR_2)this.id_break[3];
   }

   private void id_implements() {
      if (this.id_break == null) {
         this.id_break = new Object[4];
         Object[] var1 = this.id_break;
      }
   }

   public List<rrwj_3> id_protected() {
      return (List<rrwj_3>)this.id_break[1];
   }

   public static String id_protected(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-128, 35, -114, 103, -104, -91, -94, 51}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_private() {
      id_throws = new boolean[]{
         true, false, true, false, false, false, true, false, false, true, false, false, true, false, true, false, true, false, true, true, false
      };
   }

   private static void id_native() {
      id_byte = new String[]{new String("creeperfarm"), new String(".celka"), new String("creeperfarm"), new String("autocfg")};
   }
}
