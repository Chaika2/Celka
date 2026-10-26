package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class BJ extends Pv_1 implements MinecraftAccessor {
   private static short[] id_byte;
   private static float[] id_protected;
   private static String[] id_throws;
   private static byte[] id_case;
   private static boolean[] id_catch;
   public Object[] id_break;

   private static void id_byte() {
      id_byte = new short[]{0, 0, 1, 0, 0, 0, 5000, 0, 1, 0, 1, 1, 0, 0, 0, 0, 1, 0, 1, 1, 0, 0};
   }

   public BJ(C_class var1) {
      super(var1);
      this.id_break();
   }

   static {
      ntfClinit();
   }

   @Override
   public void id_class(rrFw_1 var1) {
      this.id_break();
      if (var1.id_class() == (rrFI)rrFI.staticFields7eee503931553d5586d91adc0f9df349[1]) {
         Boolean var6 = true;
         this.id_break[id_byte[12]] = var6;
      } else if (var1.id_class() == (rrFI)rrFI.staticFields7eee503931553d5586d91adc0f9df349[id_byte[13]]) {
         Boolean var7 = id_catch[4];
         this.id_break[id_byte[14]] = var7;
      }
   }

   private static void id_class() {
      id_throws = new String[]{new String("/hub")};
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -104335753;
   }

   @Override
   public void id_class(C var1) {
      this.id_break();
      String var2 = var1.id_class();
      if (var2.startsWith(id_throws[0])) {
         Boolean var7 = id_catch[5];
         this.id_break[id_byte[15]] = var7;
         Boolean var8 = id_catch[6];
         this.id_break[1] = var8;
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7175087397734893727L;
   }

   @Override
   public void id_class(rrFK var1) {
      this.id_break();
      Boolean var6 = id_catch[7];
      this.id_break[id_byte[17]] = var6;
      Boolean var7 = id_catch[8];
      this.id_break[1] = var7;
   }

   @Override
   public void id_class(q_1 var1) {
      this.id_break();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_byte[0]]) {
         if (!this.id_protected()) {
            return;
         }

         if ((Boolean)this.id_break[id_byte[1]] && (Boolean)this.id_break[1]) {
            RwHelper var2 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_byte[3]]).id_private().R();
            String var3 = "Напишите '" + (String)C_class.id_instanceof().id_protected.id_class[id_byte[4]] + "rct' чтобы сбросить флаги античита";
            ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_byte[5]]).id_class(new rrtd_3(var2.id_final(), var3, 5000));
            rrfu_3.id_byte(var3);
            Boolean var8 = id_catch[0];
            this.id_break[id_byte[7]] = var8;
            Boolean var9 = id_catch[1];
            this.id_break[1] = var9;
         }
      }
   }

   @Override
   public void id_class(rrAl_1 var1) {
      this.id_break();
      if ((Boolean)this.id_break[id_byte[9]] && var1.id_class() > 10.0F) {
         Boolean var6 = true;
         this.id_break[1] = var6;
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-61, -118, 61, 118, -70, 92, -101, -18}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void id_break() {
      if (this.id_break == null) {
         this.id_break = new Object[2];
         Object[] var1 = this.id_break;
         var1[id_catch[12]] = id_catch[13];
         var1[1] = id_catch[15];
      }
   }

   private static void id_throws() {
      id_catch = new boolean[]{false, false, true, true, false, false, false, false, false, false, false, true, false, false, true, false};
   }

   private static void id_catch() {
      id_protected = new float[]{10.0F};
   }

   private static void id_case() {
      id_case = new byte[]{2};
   }

   private boolean id_protected() {
      if ((rrfq_3)rrfp_3.id_class[1] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_byte[20]]) {
         return id_catch[9];
      } else {
         return !((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_byte[21]]).id_private().R().aJ_() ? id_catch[10] : true;
      }
   }
}
