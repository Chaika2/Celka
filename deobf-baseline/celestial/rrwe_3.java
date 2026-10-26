package celestial;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwe_3 implements rrZS<rrwU_2> {
   private static short[] id_byte;
   public Object[] id_break;
   private static byte[] id_protected;
   private static boolean[] id_throws;

   public rrwU_2 id_byte(String var1) {
      return this.id_break().stream().filter(var1x -> var1x.id_break().getName().equalsIgnoreCase(var1 + ".celka")).findFirst().orElse(null);
   }

   @Override
   public boolean id_byte(String var1, boolean var2) {
      rrwU_2 var3 = this.id_byte(var1);
      return this.id_byte(var3, var2);
   }

   public void id_byte() {
      this.id_break().forEach(var1 -> this.id_class(var1, id_throws[17]));
   }

   public boolean id_byte(rrwU_2 var1, boolean var2) {
      if (var1 == null) {
         return id_throws[8];
      } else {
         JsonObject var3 = new JsonObject();
         var1.id_break(var3);
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_byte[6]]).id_break().id_class(var1.id_break(), var3);
         return id_throws[9];
      }
   }

   public rrwe_3() {
      this.id_extends();
      ArrayList var5 = new ArrayList();
      this.id_break[id_byte[0]] = var5;
      this.id_native();
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 458027390;
   }

   public boolean id_class(rrwU_2 var1, boolean var2) {
      try {
         if (var1 == null) {
            return id_throws[2];
         } else {
            File var3 = var1.id_break();
            if (var3 == null) {
               return id_throws[3];
            } else {
               JsonElement var4 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_byte[5]]).id_break().id_break(var3);
               if (var4 != null && var4.isJsonObject()) {
                  JsonObject var5 = var4.getAsJsonObject();
                  if (var5 == null) {
                     return id_throws[5];
                  } else {
                     var1.id_class(var5);
                     return id_throws[6];
                  }
               } else {
                  return id_throws[4];
               }
            }
         }
      } catch (Exception var6) {
         return id_throws[7];
      }
   }

   @Override
   public void id_class() {
      for (rrwU_2 var2 : this.id_break()) {
         if (!((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_byte[8]]).id_break().id_class(var2.id_break())) {
            this.id_break(var2, id_throws[15]);
         }
      }
   }

   public void id_class(rrwU_2... var1) {
      ((List)this.id_break[id_byte[4]]).addAll(List.of(var1));
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1284804121679007691L;
   }

   public boolean id_class(rrwU_2 var1) {
      return id_throws[16];
   }

   @Override
   public boolean id_class(String var1, boolean var2) {
      rrwU_2 var3 = this.id_byte(var1);
      return this.id_class(var3, var2);
   }

   @Override
   public void id_class(boolean var1) {
   }

   public boolean id_break(rrwU_2 var1, boolean var2) {
      if (var1 == null) {
         return id_throws[12];
      } else {
         File var3 = var1.id_break();
         ((List)this.id_break[id_byte[7]]).remove(var1);
         return var3.exists() && var3.delete() ? id_throws[13] : id_throws[14];
      }
   }

   @Override
   public void id_break(boolean var1) {
      for (rrwU_2 var3 : this.id_break()) {
         this.id_class(var3, var1);
      }
   }

   @Override
   public Collection<rrwU_2> id_break() {
      return (List)this.id_break[id_byte[9]];
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{27, -122, 55, -125, 94, 62, -21, 70}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public boolean id_break(String var1, boolean var2) {
      rrwU_2 var3 = this.id_byte(var1);
      return var3 != null && this.id_break(var3, var2) ? id_throws[10] : id_throws[11];
   }

   public rrIb_1 id_throws() {
      return (rrIb_1)this.id_break[id_byte[11]];
   }

   private static void id_finally() {
      id_throws = new boolean[]{false, true, false, false, false, false, true, false, false, true, true, false, false, true, false, true, false, true, true};
   }

   public void id_catch() {
      this.id_break().forEach(var1 -> this.id_byte(var1, id_throws[18]));
   }

   private void id_extends() {
      if (this.id_break == null) {
         this.id_break = new Object[id_protected[11]];
         Object[] var1 = this.id_break;
      }
   }

   public rrIG id_case() {
      return (rrIG)this.id_break[id_byte[10]];
   }

   private static void id_implements() {
      id_byte = new short[]{0, 1, 2, 3, 0, 0, 0, 0, 0, 0, 1, 2, 3};
   }

   public rrIP id_protected() {
      return (rrIP)this.id_break[id_byte[12]];
   }

   private static void id_private() {
      id_protected = new byte[]{12, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 4};
   }

   private void id_native() {
      rrwU_2[] var10001 = new rrwU_2[id_protected[0]];
      var10001[id_throws[0]] = new rrIM();
      var10001[id_throws[1]] = new rrIO();
      var10001[id_protected[1]] = new rrIs_1();
      var10001[id_protected[2]] = new rrwa_3();
      byte var10003 = id_protected[3];
      rrIG var5;
      rrIG var10004 = var5 = new rrIG();
      this.id_break[id_byte[1]] = var5;
      var10001[var10003] = var10004;
      var10003 = id_protected[4];
      rrIb_1 var6;
      rrIb_1 var10 = var6 = new rrIb_1();
      this.id_break[id_byte[2]] = var6;
      var10001[var10003] = var10;
      var10001[id_protected[5]] = new rrIS();
      var10001[id_protected[6]] = new rrIE();
      var10001[id_protected[7]] = new rrIB();
      var10001[id_protected[8]] = new rrIh_1();
      var10001[id_protected[9]] = new rrIr_1();
      var10003 = id_protected[10];
      rrIP var7;
      rrIP var11 = var7 = new rrIP();
      this.id_break[id_byte[3]] = var7;
      var10001[var10003] = var11;
      this.id_class(var10001);
   }
}
