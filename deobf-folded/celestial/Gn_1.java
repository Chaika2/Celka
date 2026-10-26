package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Gn_1 extends bq_3 implements rc_3 {
   private static byte[] id_throws;
   private static String[] id_catch;
   private static short[] id_private;
   private static boolean[] id_implements;
   public Object[] id_break;

   @Override
   public boolean id_byte() {
      this.id_volatile();
      return (Gl_1)this.id_break[1] != (Gl_1)Gl_1.staticFields1a1463d15ff638568fa2d9ee62dd2289[id_private[13]] ? true : id_implements[1];
   }

   public Gn_1(C_class var1) {
      super(var1);
      this.id_volatile();
   }

   static {
      ntfClinit();
   }

   @Override
   public rn_3 id_class(boolean var1, boolean var2) {
      this.id_volatile();
      switch (((int[])GC.id_class[id_private[14]])[((Gl_1)this.id_break[1]).ordinal()]) {
         case 1:
            return new rn_3((rP_2)this.id_break[id_private[16]], (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[2]);
         case 2:
            rn_3 var3 = new rn_3((rP_2)this.id_break[id_private[18]], (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[4]);
            Gl_1 var8 = (Gl_1)Gl_1.staticFields1a1463d15ff638568fa2d9ee62dd2289[3];
            this.id_break[1] = var8;
            return var3;
         case 3:
            if (var1) {
               this.id_protected();
               return new rn_3((rP_2)this.id_break[id_private[22]], (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[2]);
            } else {
               if ((rP_2)this.id_break[id_private[24]] == null
                  || ((rP_2)this.id_break[id_private[25]]).id_break(((Ps_1)this.id_case[1]).id_volatile())
                     && ((rP_2)this.id_break[id_private[27]]).id_break(((C_class)this.id_case[id_private[28]]).id_while().id_super())) {
                  this.id_protected();
                  if ((Boolean)C_class.id_instanceof().id_char.id_class[id_private[29]]) {
                     ((Ps_1)this.id_case[1]).id_case().id_catch();
                  }

                  if ((Boolean)C_class.id_instanceof().rK.id_class[id_private[31]]) {
                     this.id_byte(id_catch[0], id_implements[2]);
                  }

                  return new rn_3((rP_2)this.id_break[id_private[32]], (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[2]);
               }

               return new rn_3((rP_2)this.id_break[id_private[34]], (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_private[35]]);
            }
         default:
            throw new IllegalStateException();
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2099208252;
   }

   @Override
   public void id_class(rP_2 var1) {
      this.id_volatile();
      this.id_break[id_private[0]] = var1;
      if ((Gl_1)this.id_break[1] == (Gl_1)Gl_1.staticFields1a1463d15ff638568fa2d9ee62dd2289[id_private[2]]) {
         Gl_1 var7 = (Gl_1)Gl_1.staticFields1a1463d15ff638568fa2d9ee62dd2289[1];
         this.id_break[1] = var7;
      }

      if ((Gl_1)this.id_break[1] == (Gl_1)Gl_1.staticFields1a1463d15ff638568fa2d9ee62dd2289[3]) {
         Gl_1 var8 = (Gl_1)Gl_1.staticFields1a1463d15ff638568fa2d9ee62dd2289[2];
         this.id_break[1] = var8;
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{44, 120, 109, 52, -35, 106, 93, 111}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2299220874095203358L;
   }

   @Override
   public String id_class() {
      this.id_volatile();
      return "Custom Goal " + (rP_2)this.id_break[id_private[39]];
   }

   private static void id_finally() {
      id_implements = new boolean[]{true, false, false};
   }

   private static void id_extends() {
      id_private = new short[]{0, 1, 0, 1, 1, 1, 3, 2, 1, 2, 1, 0, 1, 0, 0, 1, 0, 2, 0, 4, 3, 1, 0, 2, 0, 0, 1, 0, 0, 0, 1, 0, 0, 2, 0, 0, 0, 1, 0, 0};
   }

   @Override
   public void id_implements() {
      this.id_volatile();
      Gl_1 var5 = (Gl_1)Gl_1.staticFields1a1463d15ff638568fa2d9ee62dd2289[2];
      this.id_break[1] = var5;
   }

   @Override
   public void id_protected() {
      this.id_volatile();
      super.id_protected();
      Gl_1 var5 = (Gl_1)Gl_1.staticFields1a1463d15ff638568fa2d9ee62dd2289[id_private[36]];
      this.id_break[1] = var5;
      Object var6 = null;
      this.id_break[id_private[38]] = var6;
   }

   @Override
   public rP_2 id_private() {
      this.id_volatile();
      return (rP_2)this.id_break[id_private[11]];
   }

   private static void id_final() {
      id_catch = new String[]{new String("Pathing complete")};
   }

   private void id_volatile() {
      if (this.id_break == null) {
         this.id_break = new Object[2];
         Object[] var1 = this.id_break;
      }
   }

   private static void id_native() {
      id_throws = new byte[]{2};
   }
}
