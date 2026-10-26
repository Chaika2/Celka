package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrQS {
   private static String[] class_;
   private static byte[] break_;
   private static short[] byte_;
   private static long[] protected_;
   private static boolean[] throws_;

   private static void byte_() {
      class_ = new String[]{
         new String("%n"),
         new String("[Local File Header]%n"),
         new String("    Signature   :   %#010x%n"),
         new String("    Wrong signature!"),
         new String("    Version     :       %#6x    [%d.%d]%n"),
         new String("    Flag        :       %#6x%n"),
         new String("    Method      :       %#6x%n"),
         new String("    LastMTime   :   %#10x    [%tc]%n"),
         new String("    CRC         :   %#10x%n"),
         new String("    CSize       :   %#10x%n"),
         new String("    Size        :   %#10x%n"),
         new String("    NameLength  :       %#6x    [%s]%n"),
         new String("    ExtraLength :       %#6x%n"),
         new String("[Central Directory Header]%n"),
         new String("    Signature   :   %#010x%n"),
         new String("    Wrong signature!"),
         new String("    VerMadeby   :       %#6x    [%d, %d.%d]%n"),
         new String("    VerExtract  :       %#6x    [%d.%d]%n"),
         new String("    Flag        :       %#6x%n"),
         new String("    Method      :       %#6x%n"),
         new String("    LastMTime   :   %#10x    [%tc]%n"),
         new String("    CRC         :   %#10x%n"),
         new String("    CSize       :   %#10x%n"),
         new String("    Size        :   %#10x%n"),
         new String("    NameLen     :       %#6x    [%s]%n"),
         new String("    ExtraLen    :       %#6x%n"),
         new String("    CommentLen  :       %#6x%n"),
         new String("    DiskStart   :       %#6x%n"),
         new String("    Attrs       :       %#6x%n"),
         new String("    AttrsEx     :   %#10x%n"),
         new String("    LocOff      :   %#10x%n"),
         new String("        [tag=0x%04x, sz=%d, data= "),
         new String("    Error: Invalid extra data, beyond extra length"),
         new String("%02x "),
         new String("]%n"),
         new String("         ->ZIP64: "),
         new String(" *0x%x "),
         new String("%n"),
         new String("         ->PKWare NTFS%n"),
         new String("    Error: Invalid NTFS sub-tag or subsz"),
         new String("            mtime:%tc%n"),
         new String("            atime:%tc%n"),
         new String("            ctime:%tc%n"),
         new String("         ->Info-ZIP Extended Timestamp: flag=%x%n"),
         new String("            *%tc%n"),
         new String("         ->[tag=%x, size=%d]%n")
      };
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -323628407;
   }

   private static long class_(byte[] var0, int var1) {
      long var2 = rrzH_2.throw_(var0, var1);
      if (var2 == 4294967295L) {
         int var4 = var1 + 46 + rrzH_2.super_(var0, var1);
         int var5 = var4 + rrzH_2.instanceof_(var0, var1);

         while (var4 + 4 < var5) {
            int var6 = rrzH_2.while_(var0, var4);
            int var7 = rrzH_2.while_(var0, var4 + 2);
            if (var6 == 1) {
               var4 += 4;
               if (rrzH_2.int_(var0, var1) == 4294967295L) {
                  var4 += 8;
               }

               if (rrzH_2.finally_(var0, var1) == 4294967295L) {
                  var4 += 8;
               }

               return rrzH_2.catch_(var0, var4);
            }

            var4 += 4 + var7;
         }
      }

      return var2;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3078213705303344848L;
   }

   private static void class_(String var0, Object... var1) {
      System.out.printf(var0, var1);
   }

   private static void class_() {
      byte_ = new short[]{10, 12, 255, 255};
   }

   private static void class_(byte[] var0, int var1, int var2) {
      int var3 = var1 + var2;

      while (var1 + 4 <= var3) {
         int var4 = rrzH_2.while_(var0, var1);
         int var5 = rrzH_2.while_(var0, var1 + 2);
         class_("        [tag=0x%04x, sz=%d, data= ", var4, var5);
         if (var1 + var5 > var3) {
            class_("    Error: Invalid extra data, beyond extra length");
            break;
         }

         var1 += 4;

         for (int var6 = 0; var6 < var5; var6++) {
            class_("%02x ", var0[var1 + var6]);
         }

         class_(class_[34]);
         switch (var4) {
            case 1:
               class_(class_[35]);

               for (int var9 = var1; var9 + 8 <= var1 + var5; var9 += 8) {
                  class_(" *0x%x ", rrzH_2.catch_(var0, var9));
               }

               class_(class_[37]);
               break;
            case 10:
               class_(class_[38]);
               if (rrzH_2.while_(var0, var1 + 4) != 1 || rrzH_2.while_(var0, var1 + 6) != 24) {
                  class_(class_[39]);
               }

               class_(class_[40], rrQO.protected_(rrzH_2.catch_(var0, var1 + 8)));
               class_("            atime:%tc%n", rrQO.protected_(rrzH_2.catch_(var0, var1 + 16)));
               class_("            ctime:%tc%n", rrQO.protected_(rrzH_2.catch_(var0, var1 + 24)));
               break;
            case 21589:
               class_(class_[43], var0[var1]);

               for (int var8 = var1 + 1; var8 + 4 <= var1 + var5; var8 += 4) {
                  class_("            *%tc%n", rrQO.throws_(rrzH_2.try_(var0, var8)));
               }
               break;
            default:
               class_(class_[45], var4, var5);
         }

         var1 += var5;
      }
   }

   private static void class_(byte[] var0) {
      class_("%n");
      class_("[Local File Header]%n");
      class_("    Signature   :   %#010x%n", rrzH_2.catch_(var0));
      if (rrzH_2.catch_(var0) != (Long)rrzH_2.class_[10]) {
         class_("    Wrong signature!");
      } else {
         class_(class_[4], rrzH_2.case_(var0), rrzH_2.case_(var0) / 10, rrzH_2.case_(var0) % 10);
         class_("    Flag        :       %#6x%n", rrzH_2.byte_(var0));
         class_("    Method      :       %#6x%n", rrzH_2.final_(var0));
         class_("    LastMTime   :   %#10x    [%tc]%n", rrzH_2.return_(var0), rrQO.break_(rrzH_2.return_(var0)));
         class_("    CRC         :   %#10x%n", rrzH_2.else_(var0));
         class_("    CSize       :   %#10x%n", rrzH_2.protected_(var0));
         class_("    Size        :   %#10x%n", rrzH_2.new_(var0));
         class_("    NameLength  :       %#6x    [%s]%n", rrzH_2.extends_(var0), new String(var0, 30, rrzH_2.extends_(var0)));
         class_("    ExtraLength :       %#6x%n", rrzH_2.volatile_(var0));
         if (rrzH_2.volatile_(var0) != 0) {
            class_(var0, 30 + rrzH_2.extends_(var0), rrzH_2.volatile_(var0));
         }
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-101, -61, 79, 114, -61, -4, 10, -123}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      throws_ = new boolean[]{
         false,
         false,
         true,
         false,
         false,
         false,
         true,
         true,
         false,
         true,
         false,
         false,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         true,
         true,
         false,
         false,
         true,
         false,
         false,
         false,
         true,
         false,
         true,
         true,
         false,
         true,
         false,
         false,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         false,
         true,
         false,
         false,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         true,
         false,
         false,
         true
      };
   }

   private static void break_(byte[] var0, int var1) {
      class_("[Central Directory Header]%n");
      class_("    Signature   :   %#010x%n", rrzH_2.goto_(var0, var1));
      if (rrzH_2.goto_(var0, var1) != (Long)rrzH_2.class_[12]) {
         class_("    Wrong signature!");
      } else {
         class_(
            class_[16],
            rrzH_2.throws_(var0, var1),
            rrzH_2.throws_(var0, var1) >> 8,
            (rrzH_2.throws_(var0, var1) & 0xFF) / 10,
            (rrzH_2.throws_(var0, var1) & 0xFF) % 10
         );
         class_(
            "    VerExtract  :       %#6x    [%d.%d]%n", rrzH_2.interface_(var0, var1), rrzH_2.interface_(var0, var1) / 10, rrzH_2.interface_(var0, var1) % 10
         );
         class_("    Flag        :       %#6x%n", rrzH_2.else_(var0, var1));
         class_("    Method      :       %#6x%n", rrzH_2.synchronized_(var0, var1));
         class_("    LastMTime   :   %#10x    [%tc]%n", rrzH_2.volatile_(var0, var1), rrQO.break_(rrzH_2.volatile_(var0, var1)));
         class_("    CRC         :   %#10x%n", rrzH_2.protected_(var0, var1));
         class_("    CSize       :   %#10x%n", rrzH_2.finally_(var0, var1));
         class_("    Size        :   %#10x%n", rrzH_2.int_(var0, var1));
         class_("    NameLen     :       %#6x    [%s]%n", rrzH_2.super_(var0, var1), new String(var0, var1 + 46, rrzH_2.super_(var0, var1)));
         class_("    ExtraLen    :       %#6x%n", rrzH_2.instanceof_(var0, var1));
         if (rrzH_2.instanceof_(var0, var1) != 0) {
            class_(var0, var1 + 46 + rrzH_2.super_(var0, var1), rrzH_2.instanceof_(var0, var1));
         }

         class_(class_[26], rrzH_2.implements_(var0, var1));
         class_("    DiskStart   :       %#6x%n", rrzH_2.extends_(var0, var1));
         class_("    Attrs       :       %#6x%n", rrzH_2.continue_(var0, var1));
         class_("    AttrsEx     :   %#10x%n", rrzH_2.public_(var0, var1));
         class_("    LocOff      :   %#10x%n", rrzH_2.throw_(var0, var1));
      }
   }

   private static void throws_() {
      break_ = new byte[]{3, 10, 2, 10, 2, 2, 30, 30, 4, 8, 2, 10, 3, 10, 3, 10, 2, 10, 2, 2, 46, 46, 46, 4, 2, 4, 4, 2, 2, 8, 4, 6, 24, 8, 16, 24, 4, 2};
   }

   private static void protected_() {
      protected_ = new long[]{4294967295L, 4294967295L, 4294967295L};
   }
}
