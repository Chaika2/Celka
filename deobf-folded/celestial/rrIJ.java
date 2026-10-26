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

public class rrIJ implements rrZS<rrIX> {
   private static short[] id_byte;
   private static byte[] id_protected;
   private static String[] id_throws;
   private static boolean[] id_case;
   public Object[] id_break;

   public List<rrwj_3> id_byte() {
      return (List<rrwj_3>)this.id_break[1];
   }

   public boolean id_byte(String var1) {
      return ((Map)this.id_break[id_byte[23]]).entrySet().stream().anyMatch(var1x -> ((String)var1x.getKey()).equalsIgnoreCase(var1.toLowerCase()));
   }

   public boolean id_byte(rrIX var1, boolean var2) {
      if (var1 == null) {
         return id_case[10];
      } else {
         JsonObject var3 = new JsonObject();
         var1.id_break(var3);
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_byte[12]]).id_break().id_class(var1.id_throws(), var3);
         if (var2) {
            if (!this.id_class(var1) && var1 != this.id_protected()) {
               ((List)this.id_break[2]).forEach(var1x -> var1x.id_protected(var1));
            }
         } else {
            ((List)this.id_break[2]).forEach(var1x -> var1x.id_class(var1));
         }

         return true;
      }
   }

   @Override
   public boolean id_byte(String var1, boolean var2) {
      rrIX var3 = this.id_protected(var1);
      if (var3 == null) {
         var3 = new rrIX(var1);
         ((Map)this.id_break[id_byte[11]]).put(var1, var3);
      }

      return this.id_byte(var3, var2);
   }

   public rrIJ() {
      this.id_native();
      HashMap var5 = new HashMap();
      this.id_break[id_byte[0]] = var5;
      ArrayList var6 = new ArrayList();
      this.id_break[1] = var6;
      ArrayList var7 = new ArrayList();
      this.id_break[2] = var7;
      this.id_private();
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean id_class(String var1, boolean var2) {
      rrIX var3 = this.id_protected(var1);
      return this.id_class(var3, var2);
   }

   public boolean id_class(rrIX var1, boolean var2) {
      try {
         if (var1 == null) {
            return id_case[6];
         } else {
            JsonObject var3 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_byte[8]]).id_break().id_break(var1.id_throws()).getAsJsonObject();
            if (var3 == null) {
               return id_case[7];
            } else {
               var1.id_class(var3);
               if (var2) {
                  ((List)this.id_break[2]).forEach(var1x -> var1x.id_break(var1));
               }

               this.id_break[3] = var1;
               return true;
            }
         }
      } catch (Exception var9) {
         return id_case[9];
      }
   }

   private void id_class(rrwj_3... var1) {
      ((List)this.id_break[1]).addAll(List.of(var1));
   }

   @Override
   public void id_class() {
      for (rrIX var2 : this.id_break()) {
         if (!((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_byte[20]]).id_break().id_class(var2.id_throws())) {
            this.id_break(var2, true);
         }
      }
   }

   public void id_class(rrZp_1... var1) {
      ((List)this.id_break[2]).addAll(List.of(var1));
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5830413674298574628L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -920288770;
   }

   public boolean id_class(rrIX var1) {
      return var1.id_class().equals(id_throws[3]);
   }

   @Override
   public void id_class(boolean var1) {
      File var2 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_byte[4]]).id_break().id_class(id_throws[0]);
      File[] var3 = var2.listFiles();
      if (var3 != null) {
         File[] var4 = var3;
         int var5 = var3.length;

         for (int var6 = id_case[4]; var6 < var5; var6++) {
            File var7 = var4[var6];
            if (FilenameUtils.getExtension(var7.getName()).equals(id_throws[1].substring(1))) {
               String var8 = FilenameUtils.removeExtension(var7.getName());
               rrIX var9 = new rrIX(var8);
               var9.id_byte();
               if (var1 && !((Map)this.id_break[id_byte[5]]).containsKey(var8)) {
                  ((List)this.id_break[2]).forEach(var1x -> var1x.id_protected(var9));
               }

               ((Map)this.id_break[id_byte[7]]).put(var8, var9);
            }
         }
      }
   }

   @Override
   public boolean id_break(String var1, boolean var2) {
      rrIX var3 = this.id_protected(var1);
      return var3 != null && this.id_break(var3, var2) ? true : id_case[13];
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{115, -53, -85, 116, -107, 98, 55, -46}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public boolean id_break(rrIX var1, boolean var2) {
      if (var1 == null) {
         return id_case[14];
      } else {
         File var3 = var1.id_throws();
         ((Map)this.id_break[id_byte[18]]).remove(var1.id_class());
         if (var2 && !this.id_class(var1)) {
            ((List)this.id_break[2]).forEach(var1x -> var1x.id_byte(var1));
         }

         return var3.exists() && var3.delete() ? true : id_case[16];
      }
   }

   @Override
   public Collection<rrIX> id_break() {
      return ((Map)this.id_break[id_byte[21]]).values().stream().filter(var1 -> !this.id_class(var1) ? true : id_case[19]).toList();
   }

   @Override
   public void id_break(boolean var1) {
      for (rrIX var3 : this.id_break()) {
         this.id_class(var3, var1);
      }
   }

   public Map<String, rrIX> id_throws() {
      return (Map<String, rrIX>)this.id_break[id_byte[27]];
   }

   private static void id_finally() {
      id_protected = new byte[]{2, 4};
   }

   public void id_catch() {
      this.id_class(true);
      this.id_class();
   }

   private static void id_extends() {
      id_throws = new String[]{new String("configs"), new String(".celka"), new String("configs"), new String("autocfg")};
   }

   public List<rrZp_1> id_case() {
      return (List<rrZp_1>)this.id_break[2];
   }

   private static void id_implements() {
      id_case = new boolean[]{
         false, true, false, true, false, true, false, false, true, false, false, true, true, false, false, true, false, true, true, false
      };
   }

   public rrIX id_protected() {
      return (rrIX)this.id_break[3];
   }

   public rrIX id_protected(String var1) {
      if (((Map)this.id_break[id_byte[15]]).containsKey(var1)) {
         return (rrIX)((Map)this.id_break[id_byte[16]]).get(var1);
      } else {
         File var2 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_byte[17]]).id_break().id_class(id_throws[2]);
         return new File(var2, var1 + ".celka").exists() ? new rrIX(var1) : null;
      }
   }

   private void id_private() {
      rrwj_3[] var10001 = new rrwj_3[2];
      var10001[id_case[0]] = new rrIx_1();
      var10001[1] = new rrId_1();
      this.id_class(var10001);
      this.id_class(id_case[2]);
   }

   private static void id_volatile() {
      id_byte = new short[]{0, 1, 2, 1, 0, 0, 2, 0, 0, 2, 3, 0, 0, 2, 2, 0, 0, 0, 0, 2, 0, 0, 2, 0, 3, 2, 1, 0};
   }

   private void id_native() {
      if (this.id_break == null) {
         this.id_break = new Object[4];
         Object[] var1 = this.id_break;
      }
   }
}
