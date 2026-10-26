package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Br_1 extends Pv_1 implements C_volatile {
   private static float[] id_byte;
   private static short[] id_protected;
   private static boolean[] id_throws;
   public Object[] id_break;
   private static byte[] id_case;

   @Override
   public PX id_byte() {
      rrTj_1 var1 = this.id_break();
      return var1 == null ? null : (PX)((BS)var1).id_class[0];
   }

   public Br_1(C_class var1) {
      super(var1);
      this.id_case();
      BB var6 = new BB(var1.id_throw());
      this.id_break[3] = var6;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1358937062;
   }

   @Override
   public void id_class(j_1 var1) {
      this.id_case();
      if (var1.id_class() == (V)V.staticFields30e1cd8580ce39faa61be3646b7cc079[0]) {
         ((BB)this.id_break[3]).id_break();
         Object var6 = null;
         this.id_break[0] = var6;
      }
   }

   @Override
   public void id_class(t_1 var1) {
      this.id_case();
      if ((BS)this.id_break[0] != null) {
         PX var2 = ((BB)this.id_break[3]).id_class((PX)((BS)this.id_break[0]).id_class[0]);
         var1.id_class(var2);
      }
   }

   @Override
   public void id_class(rrAz_1 var1) {
      this.id_case();
      if ((BS)this.id_break[0] != null) {
         rz_3 var2 = C_throws.id_byte().id_void().id_throws();
         if (var2 != null) {
            rrTq_1 var3 = var2.id_throws();
            if (var3 != null) {
               var1.id_class(var3.id_break());
               var1.id_class(var3.id_class());
               return;
            }
         }

         var1.id_class(((Ps_1)this.id_class[1]).id_catch().id_goto());
         var1.id_class(PJ.id_class(((Ps_1)this.id_class[1]).id_catch().id_goto(), var1.id_protected(), false));
      }
   }

   @Override
   public void id_class(g_1 var1) {
      this.id_finally();
   }

   @Override
   public void id_class(q_1 var1) {
      this.id_case();
      if ((BS)this.id_break[0] != null) {
         switch (((int[])BP.id_class[0])[var1.id_class().ordinal()]) {
            case 1:
               if ((Bs_1)((BS)this.id_break[0]).id_class[1] == (Bs_1)Bs_1.staticFieldsab676614e82b32e79a1e1e0ca1d59f08[2]) {
                  return;
               }

               rrTT.id_break[3] = this;
               if ((Bs_1)((BS)this.id_break[0]).id_class[1] == (Bs_1)Bs_1.staticFieldsab676614e82b32e79a1e1e0ca1d59f08[1]) {
                  PX var8 = new PX((Float)((Ps_1)this.id_class[1]).id_catch().id_throws[15], (Float)((Ps_1)this.id_class[1]).id_catch().id_throws[16]);
                  this.id_break[2] = var8;
               }

               PX var2 = ((BB)this.id_break[3]).id_class((PX)((BS)this.id_break[0]).id_class[0]);
               cb_3 var15 = ((Ps_1)this.id_class[1]).id_catch();
               Float var9 = var2.id_throws();
               var15.id_throws[15] = var9;
               var15 = ((Ps_1)this.id_class[1]).id_catch();
               Float var10 = var2.id_protected();
               var15.id_throws[16] = var10;
               break;
            case 2:
               if ((PX)this.id_break[2] != null) {
                  cb_3 var10000 = ((Ps_1)this.id_class[1]).id_catch();
                  Float var11 = ((PX)this.id_break[2]).id_throws();
                  var10000.id_throws[15] = var11;
                  var10000 = ((Ps_1)this.id_class[1]).id_catch();
                  Float var12 = ((PX)this.id_break[2]).id_protected();
                  var10000.id_throws[16] = var12;
                  Object var13 = null;
                  this.id_break[2] = var13;
               }
         }
      }
   }

   public void id_class(PX var1, boolean var2) {
      this.id_case();
      BS var7 = new BS(var1, var2);
      this.id_break[0] = var7;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5070967587594919461L;
   }

   @Override
   public C_package id_class() {
      this.id_case();
      return (BB)this.id_break[3];
   }

   @Override
   public void id_class(rrAX var1) {
      this.id_case();
      if ((BS)this.id_break[0] != null) {
         PX var2 = ((BB)this.id_break[3]).id_class((PX)((BS)this.id_break[0]).id_class[0]);
         var1.id_class(var2);
      }
   }

   @Override
   public rrTj_1 id_break() {
      this.id_case();
      return (BS)this.id_break[0];
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-30, -116, -70, -25, 122, -106, -99, -92}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_break(y_1 var1) {
      this.id_case();
      if (var1.id_protected() instanceof rZO var2 && (var2 instanceof rZJ || var2 instanceof rZX)) {
         PX var8 = new PX(var2.id_class(0.0F), var2.id_break(0.0F));
         this.id_break[1] = var8;
      }
   }

   public void id_throws() {
      this.id_case();
      if ((BS)this.id_break[0] != null) {
         PX var1 = ((BB)this.id_break[3]).id_class((PX)((BS)this.id_break[0]).id_class[0]);
         cb_3 var10000 = ((Ps_1)this.id_class[1]).id_catch();
         Float var6 = var1.id_throws();
         var10000.id_throws[15] = var6;
      }
   }

   private void id_finally() {
      this.id_case();
      Object var5 = null;
      this.id_break[1] = var5;
      Object var6 = null;
      this.id_break[0] = var6;
   }

   private static void id_catch() {
      id_protected = new short[]{
         3,
         0,
         3,
         0,
         0,
         0,
         3,
         0,
         0,
         0,
         0,
         1,
         2,
         3,
         0,
         1,
         1,
         1,
         15,
         1,
         16,
         2,
         3,
         0,
         0,
         1,
         15,
         1,
         16,
         2,
         1,
         2,
         15,
         1,
         2,
         16,
         2,
         0,
         1,
         1,
         0,
         3,
         0,
         0,
         0,
         3,
         0,
         0,
         1,
         1,
         0,
         0,
         3,
         0,
         0,
         1,
         15,
         0,
         1
      };
   }

   private static void id_extends() {
      id_case = new byte[]{4};
   }

   private void id_case() {
      if (this.id_break == null) {
         this.id_break = new Object[4];
         Object[] var1 = this.id_break;
      }
   }

   private static void id_implements() {
      id_byte = new float[2];
   }

   public Optional<PX> id_protected() {
      this.id_case();
      return C_class.id_instanceof().n.id_class[0] ? Optional.ofNullable((PX)this.id_break[1]) : Optional.empty();
   }

   private static void id_private() {
      id_throws = new boolean[1];
   }

   @Override
   public void id_native() {
      super.id_native();
      this.id_finally();
   }
}
