package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Br_1 extends Pv_1 implements C_volatile {
   private static float[] byte_;
   private static short[] protected_;
   private static boolean[] throws_;
   public Object[] break_;
   private static byte[] case_;

   @Override
   public PX byte_() {
      rrTj_1 var1 = this.break_();
      return var1 == null ? null : (PX)((BS)var1).class_[0];
   }

   public Br_1(C_class var1) {
      super(var1);
      this.case_();
      BB var6 = new BB(var1.throw_());
      this.break_[3] = var6;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1358937062;
   }

   @Override
   public void class_(j_1 var1) {
      this.case_();
      if (var1.class_() == (V)V.staticFields30e1cd8580ce39faa61be3646b7cc079[0]) {
         ((BB)this.break_[3]).break_();
         Object var6 = null;
         this.break_[0] = var6;
      }
   }

   @Override
   public void class_(t_1 var1) {
      this.case_();
      if ((BS)this.break_[0] != null) {
         PX var2 = ((BB)this.break_[3]).class_((PX)((BS)this.break_[0]).class_[0]);
         var1.class_(var2);
      }
   }

   @Override
   public void class_(rrAz_1 var1) {
      this.case_();
      if ((BS)this.break_[0] != null) {
         rz_3 var2 = C_throws.byte_().void_().throws_();
         if (var2 != null) {
            rrTq_1 var3 = var2.throws_();
            if (var3 != null) {
               var1.class_(var3.break_());
               var1.class_(var3.class_());
               return;
            }
         }

         var1.class_(((Ps_1)this.class_[1]).catch_().goto_());
         var1.class_(PJ.class_(((Ps_1)this.class_[1]).catch_().goto_(), var1.protected_(), false));
      }
   }

   @Override
   public void class_(g_1 var1) {
      this.finally_();
   }

   @Override
   public void class_(q_1 var1) {
      this.case_();
      if ((BS)this.break_[0] != null) {
         switch (((int[])BP.class_[0])[var1.class_().ordinal()]) {
            case 1:
               if ((Bs_1)((BS)this.break_[0]).class_[1] == (Bs_1)Bs_1.staticFieldsab676614e82b32e79a1e1e0ca1d59f08[2]) {
                  return;
               }

               rrTT.break_[3] = this;
               if ((Bs_1)((BS)this.break_[0]).class_[1] == (Bs_1)Bs_1.staticFieldsab676614e82b32e79a1e1e0ca1d59f08[1]) {
                  PX var8 = new PX((Float)((Ps_1)this.class_[1]).catch_().throws_[15], (Float)((Ps_1)this.class_[1]).catch_().throws_[16]);
                  this.break_[2] = var8;
               }

               PX var2 = ((BB)this.break_[3]).class_((PX)((BS)this.break_[0]).class_[0]);
               cb_3 var15 = ((Ps_1)this.class_[1]).catch_();
               Float var9 = var2.throws_();
               var15.throws_[15] = var9;
               var15 = ((Ps_1)this.class_[1]).catch_();
               Float var10 = var2.protected_();
               var15.throws_[16] = var10;
               break;
            case 2:
               if ((PX)this.break_[2] != null) {
                  cb_3 var10000 = ((Ps_1)this.class_[1]).catch_();
                  Float var11 = ((PX)this.break_[2]).throws_();
                  var10000.throws_[15] = var11;
                  var10000 = ((Ps_1)this.class_[1]).catch_();
                  Float var12 = ((PX)this.break_[2]).protected_();
                  var10000.throws_[16] = var12;
                  Object var13 = null;
                  this.break_[2] = var13;
               }
         }
      }
   }

   public void class_(PX var1, boolean var2) {
      this.case_();
      BS var7 = new BS(var1, var2);
      this.break_[0] = var7;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5070967587594919461L;
   }

   @Override
   public C_package class_() {
      this.case_();
      return (BB)this.break_[3];
   }

   @Override
   public void class_(rrAX var1) {
      this.case_();
      if ((BS)this.break_[0] != null) {
         PX var2 = ((BB)this.break_[3]).class_((PX)((BS)this.break_[0]).class_[0]);
         var1.class_(var2);
      }
   }

   @Override
   public rrTj_1 break_() {
      this.case_();
      return (BS)this.break_[0];
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-30, -116, -70, -25, 122, -106, -99, -92}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void break_(y_1 var1) {
      this.case_();
      if (var1.protected_() instanceof rZO var2 && (var2 instanceof rZJ || var2 instanceof rZX)) {
         PX var8 = new PX(var2.class_(0.0F), var2.break_(0.0F));
         this.break_[1] = var8;
      }
   }

   public void throws_() {
      this.case_();
      if ((BS)this.break_[0] != null) {
         PX var1 = ((BB)this.break_[3]).class_((PX)((BS)this.break_[0]).class_[0]);
         cb_3 var10000 = ((Ps_1)this.class_[1]).catch_();
         Float var6 = var1.throws_();
         var10000.throws_[15] = var6;
      }
   }

   private void finally_() {
      this.case_();
      Object var5 = null;
      this.break_[1] = var5;
      Object var6 = null;
      this.break_[0] = var6;
   }

   private static void catch_() {
      protected_ = new short[]{
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

   private static void extends_() {
      case_ = new byte[]{4};
   }

   private void case_() {
      if (this.break_ == null) {
         this.break_ = new Object[4];
         Object[] var1 = this.break_;
      }
   }

   private static void implements_() {
      byte_ = new float[2];
   }

   public Optional<PX> protected_() {
      this.case_();
      return C_class.instanceof_().n.class_[0] ? Optional.ofNullable((PX)this.break_[1]) : Optional.empty();
   }

   private static void private_() {
      throws_ = new boolean[1];
   }

   @Override
   public void native_() {
      super.native_();
      this.finally_();
   }
}
