package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFZ extends rrFl_1<rrqr_3> {
   private static short[] id_break;
   private static String[] id_protected;
   private static boolean[] id_throws;
   private static byte[] id_case;
   public Object[] id_class;
   private static float[] id_catch;

   @Override
   public Collection<rrqr_3> id_byte() {
      return ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_break[9]]).id_private().o().id_new();
   }

   public rrFZ(HudWidget var1) {
      this.id_case();
      this.id_class[id_break[0]] = var1;
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_break[1]])
         .id_private()
         .o()
         .id_new()
         .add(
            new rrFv_1(
               this,
               new rgN_2(id_protected[0]),
               rrfu_3.id_class().id_break(rVa_1.id_class(id_protected[1]), rVa_1.id_class(id_protected[2])).id_class(id_protected[3]).id_break()
            )
         );
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2117276552;
   }

   public boolean id_class() {
      this.id_case();
      return (Boolean)this.id_class[id_break[11]];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1721222230318065820L;
   }

   public float id_class(rrqr_3 var1) {
      String var2 = var1.id_protected().getString() + var1.id_private();
      return ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_break[10]]).id_finally().id_break(var2) + id_catch[5];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-13, -30, -105, 17, -81, -52, 120, -105}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_class(Ml_1 var1, float var2, float var3) {
      this.id_case();
      float var4 = ((HudWidget)this.id_class[id_break[2]]).id_long();
      StaffViewer var5 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_break[3]]).id_private().o();
      rrZO var6 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_break[4]]).id_finally();
      this.id_break(id_catch[0]);
      float var7 = this.id_finally();
      float var8 = this.id_protected();
      var6.id_class(MinecraftAccessor.id_strictfp);

      for (rrqr_3 var10 : var5.id_super()) {
         AnimValue var11 = var10.id_break();
         var10.id_class(var10.id_catch());
         if (var11.id_case()) {
            float var12 = var11.id_byte();
            float var13 = var11.id_continue();
            float var14 = var8 * id_catch[1] * var13;
            float var15 = var2 + id_catch[2];
            float var16 = var3 + var7 - var14;
            int var17 = (int)(id_catch[3] * var12 * var4);
            var6.id_break(var1, var10.id_protected(), (double)var15, (double)var16, rrZF.d_, var17);
            var6.id_break(
               var1,
               var10.id_byte(),
               (double)(var15 + ((HudWidget)this.id_class[id_break[5]]).id_implements() - var6.id_break(var10.id_private()) - id_catch[4]),
               (double)var16,
               rrZF.d_,
               var17
            );
            float var18 = var8 * var12;
            var7 += var18;
            this.id_class(var18);
         }
      }

      var6.id_byte(MinecraftAccessor.id_strictfp);
   }

   private static void id_break() {
      id_case = new byte[]{2};
   }

   @Override
   public void id_throws() {
      this.id_case();
      super.id_throws();
      Collection var1 = this.id_byte();
      Boolean var10 = id_throws[0];
      this.id_class[id_break[6]] = var10;
      if (!var1.isEmpty()) {
         Iterator var2 = var1.iterator();

         while (var2.hasNext()) {
            rrqr_3 var3 = (rrqr_3)var2.next();
            if (var3 instanceof rrqP_2) {
               rrqP_2 var4 = (rrqP_2)var3;
               if (var3.id_break().id_catch()) {
                  var2.remove();
               } else {
                  if (var3.id_catch()) {
                     Boolean var11 = id_throws[1];
                     this.id_class[id_break[7]] = var11;
                  }

                  rrqs_3 var5 = var4.id_finally();
                  var5.id_protected();
                  if (var5.id_byte() == (rrqS_2)rrqS_2.staticFields76a63d849f9636f9a8b567c1e8edd09e[id_break[8]]) {
                     var3.id_class(id_throws[2]);
                  }
               }
            }
         }
      }
   }

   private static void id_catch() {
      id_protected = new String[]{new String("Preview Staff"), new String("#ffd700"), new String("#ffddaf"), new String("Status")};
   }

   private static void id_extends() {
      id_throws = new boolean[]{false, true, false, true, false};
   }

   private void id_case() {
      if (this.id_class == null) {
         this.id_class = new Object[id_case[0]];
         Object[] var1 = this.id_class;
         var1[id_throws[3]] = id_throws[4];
      }
   }

   private static void id_implements() {
      id_catch = new float[]{18.0F, 0.8F, 3.0F, 255.0F, 5.0F, 15.0F, 10.0F};
   }

   @Override
   public float id_protected() {
      return id_catch[6];
   }

   private static void id_private() {
      id_break = new short[]{0, 0, 0, 0, 0, 0, 1, 1, 4, 0, 0, 1};
   }
}
