package celestial;

import java.net.InetAddress;
import java.net.UnknownHostException;

class mw_3 extends Thread {
   mw_3(mt_3 var1, String var2, String var3, int var4) {
      super(var2);
      this.id_byte = var1;
      this.id_class = var3;
      this.id_break = var4;
   }

   @Override
   public void run() {
      InetAddress var1 = null;

      try {
         if (this.id_byte.id_catch) {
            return;
         }

         var1 = InetAddress.getByName(this.id_class);
         this.id_byte.id_case = rud_3.id_class(var1, this.id_break, ((Qw_1)this.id_byte.id_volatile.id_class[20]).id_case());
         this.id_byte
            .id_case
            .id_class(new Al_1(this.id_byte.id_case, this.id_byte.id_volatile, this.id_byte.id_private, var1x -> this.id_byte.id_break(var1x)));
         this.id_byte.id_case.id_class(new rmJ_2(this.id_class, this.id_break, ruv_3.LOGIN));
         this.id_byte.id_case.id_class(new rmu_3(this.id_byte.id_volatile.id_while().id_throws()));
         rrFK.id_class((rrFD)rrFD.staticFields1658baa549203f63991cdcef51acf497[0], rgP_2.id_byte(""), this.id_byte.id_case);
      } catch (UnknownHostException var4) {
         if (this.id_byte.id_catch) {
            return;
         }

         mt_3.id_throws.error("Couldn't connect to server", var4);
         this.id_byte
            .id_volatile
            .execute(
               () -> this.id_byte
                     .id_volatile
                     .id_break(new ZG(this.id_byte.id_private, cN_2.id_implements, new rgn_3("disconnect.genericReason", "Unknown host")))
            );
      } catch (Exception var5) {
         if (this.id_byte.id_catch) {
            return;
         }

         mt_3.id_throws.error("Couldn't connect to server", var5);
         String var3 = var1 == null ? var5.toString() : var5.toString().replaceAll(var1 + ":" + this.id_break, "");
         this.id_byte
            .id_volatile
            .execute(() -> this.id_byte.id_volatile.id_break(new ZG(this.id_byte.id_private, cN_2.id_implements, new rgn_3("disconnect.genericReason", var3))));
      }
   }
}
