package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtu_3 {
   private static boolean[] id_break;
   private static byte[] id_byte;
   public Object[] id_class;
   private static short[] id_protected;

   public void id_byte(int var1, int var2, int var3) {
      for (rrtN_2 var5 : (List)this.id_class[0]) {
         if (var5.aq_()) {
            var5.id_break(var1, var2, var3);

            for (rrtm_3 var7 : var5.id_strictfp()) {
               var7.id_class(var1, var2, var3);
            }
         }
      }
   }

   public static rrtu_3[] id_byte() {
      return new rrtu_3[]{(rrtu_3)ClickGuiScreen.id_class[1], (rrtu_3)rrvV.id_break[0]};
   }

   public rrtu_3() {
      this.id_native();
      CopyOnWriteArrayList var5 = new CopyOnWriteArrayList();
      this.id_class[0] = var5;
   }

   static {
      ntfClinit();
   }

   public void id_class(char var1, int var2) {
      for (rrtN_2 var4 : (List)this.id_class[0]) {
         if (var4.aq_()) {
            var4.id_class(var1, var2);

            for (rrtm_3 var6 : var4.id_strictfp()) {
               var6.id_class(var1, var2);
            }
         }
      }
   }

   public void id_class(Ml_1 var1, int var2, int var3, boolean var4) {
      if (this.id_case()) {
         rrwb_3.id_class(var1, this, MinecraftAccessor.id_const.id_volatile(), MinecraftAccessor.id_const.id_final());
      }

      for (rrtN_2 var6 : (List)this.id_class[0]) {
         this.id_class(var6, !var4 ? true : id_break[1]);
         var6.id_boolean();
         if (!var6.aq_()) {
            if (var6.id_protected()) {
               var6.at_();
               ((List)this.id_class[0]).remove(var6);
            }

            var6.id_for();
         } else {
            var1.id_class();
            RenderSystem.enableAlphaTest();
            var6.id_class(var1, this, var2, var3, var4);
            RenderSystem.disableAlphaTest();
            var1.id_break();
            var6.id_break(var1, this, var2, var3, var4);
         }
      }

      rrwb_3.id_class(var1, this);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1879580524;
   }

   public void id_class(rrtN_2 var1, boolean var2) {
      if (var2) {
         var1.as_();
      }
   }

   public void id_class(rrtN_2 var1, Runnable var2) {
      ((List)this.id_class[0]).add(var1);
      var2.run();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 9065764500841392458L;
   }

   public void id_class(rrtN_2... var1) {
      ((List)this.id_class[0]).addAll(Arrays.asList(var1));
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-58, -28, -95, -56, 83, 100, -95, 86}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public List<rrtN_2> id_class() {
      return (List<rrtN_2>)this.id_class[0];
   }

   public void id_class(int var1, int var2, int var3) {
      for (rrtN_2 var5 : (List)this.id_class[0]) {
         if (var5.aq_()) {
            var5.id_class(var1, var2, var3);

            for (rrtm_3 var7 : var5.id_strictfp()) {
               var7.id_break(var1, var2, var3);
            }
         }
      }
   }

   public void id_class(rrtN_2 var1) {
      ((List)this.id_class[0]).add(var1);
      var1.id_class(this);
   }

   public boolean id_class(rrtN_2 var1, int var2, int var3) {
      List var4 = this.id_class();

      for (rrtN_2 var6 : var4) {
         if (var6 != var1 && var6.aq_()) {
            if (var6.id_class(var2, var3)) {
               return var6.id_class(var4) > var1.id_class(var4) ? true : id_break[14];
            }

            for (rrtm_3 var8 : var6.id_strictfp()) {
               if (var8.id_implements()) {
                  return true;
               }
            }
         }
      }

      return id_break[16];
   }

   public static boolean id_class(rrtu_3 var0, int var1, int var2) {
      if (var0 == null) {
         return false;
      } else {
         for (rrtN_2 var4 : var0.id_class()) {
            if (var4.aq_() && var4.id_class(var1, var2)) {
               return true;
            }
         }

         return id_break[12];
      }
   }

   public void id_class(int var1, int var2, int var3, boolean var4, boolean var5) {
      for (int var6 = ((List)this.id_class[0]).size() - 1; var6 >= 0; var6--) {
         rrtN_2 var7 = (rrtN_2)((List)this.id_class[0]).get(var6);
         if (var7.aq_()) {
            for (rrtm_3 var9 : var7.id_strictfp()) {
               if (!rrtm_3.id_class(var9, var7) && (!var9.id_volatile().id_break((float)var1, (float)var2) || !var7.id_break(this, var1, var2))) {
                  var9.id_class(this, var1, var2, var3);
               }
            }
         }
      }

      for (int var10 = ((List)this.id_class[0]).size() - 1; var10 >= 0; var10--) {
         rrtN_2 var12 = (rrtN_2)((List)this.id_class[0]).get(var10);
         if (var12.aq_() && var12.id_class(var1, var2)) {
            var12.id_class(this, var1, var2, var3, var4, var5);
            break;
         }
      }

      for (int var11 = ((List)this.id_class[0]).size() - 1; var11 >= 0; var11--) {
         rrtN_2 var13 = (rrtN_2)((List)this.id_class[0]).get(var11);
         if (var13.aq_() && var13.id_float().id_case() && !var13.id_break(this, var1, var2)) {
            var13.id_break(this, var1, var2, var3, var4, var5);
         }
      }
   }

   public boolean id_class(rrtu_3 var1, int var2, int var3, double var4, boolean var6, boolean var7) {
      for (int var8 = ((List)this.id_class[0]).size() - 1; var8 >= 0; var8--) {
         rrtN_2 var9 = (rrtN_2)((List)this.id_class[0]).get(var8);
         if (var9.aq_() && var9.id_class(this, var2, var3, var4, var6, var7)) {
            return true;
         }
      }

      return id_break[7];
   }

   public void id_break() {
      for (rrtN_2 var2 : (List)this.id_class[0]) {
         if (var2.aq_()) {
            var2.r();

            for (rrtm_3 var4 : var2.id_strictfp()) {
               var4.id_extends();
            }
         }
      }
   }

   public void id_break(rrtN_2 var1) {
      ((List)this.id_class[0]).add(var1);
   }

   public void id_break(int var1, int var2, int var3) {
      for (rrtN_2 var5 : (List)this.id_class[0]) {
         if (var5.aq_()) {
            var5.id_byte(var1, var2, var3);

            for (rrtm_3 var7 : var5.id_strictfp()) {
               var7.id_byte(var1, var2, var3);
            }
         }
      }
   }

   public void id_throws() {
      for (rrtN_2 var2 : (List)this.id_class[0]) {
         var2.id_char();
      }
   }

   private static void id_finally() {
      id_protected = new short[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0};
   }

   public void id_catch() {
      for (rrtN_2 var2 : (List)this.id_class[0]) {
         if (var2.aq_()) {
            var2.id_private();
            var2.id_short().id_protected();

            for (rrtm_3 var4 : var2.id_strictfp()) {
               var4.id_case();
            }
         }
      }
   }

   private static void id_extends() {
      id_break = new boolean[]{
         true, false, true, true, true, true, true, false, true, false, false, true, false, true, false, true, false, false, false, true, true
      };
   }

   public boolean id_case() {
      for (rrtN_2 var2 : (List)this.id_class[0]) {
         if (var2 instanceof rrvj_1 && var2.id_short().id_catch()) {
            return true;
         }
      }

      return id_break[9];
   }

   private static void id_implements() {
      id_byte = new byte[]{2};
   }

   public static void id_protected() {
      for (rrtu_3 var3 : id_byte()) {
         for (rrtN_2 var5 : var3.id_class()) {
            var5.id_instanceof();
         }
      }
   }

   public void id_private() {
      for (rrtN_2 var2 : (List)this.id_class[0]) {
         if (var2.aq_()) {
            var2.id_void();

            for (rrtm_3 var4 : var2.id_strictfp()) {
               var4.id_else();
            }
         }
      }
   }

   private void id_native() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
      }
   }
}
