package celestial;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rvj_3 implements ruS_2<At_1> {
   private static final Logger id_break = LogManager.getLogger();
   private rfH_2 id_byte;
   private xc_3 id_protected;
   rZM id_class;
   private boolean id_throws;

   public rfH_2 id_byte() {
      return this.id_byte;
   }

   public rvj_3() {
   }

   public rvj_3(rfH_2 var1, xc_3 var2, rZM var3, boolean var4, String var5) {
      this.id_byte = var1.id_int();
      this.id_protected = var2;
      this.id_class = var3;
      this.id_throws = var4;
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_byte = var1.id_byte();
      this.id_protected = xd_3.id_char.id_class(var1.id_case());
      this.id_class = var1.id_class(rZM.class);
      this.id_throws = var1.readBoolean();
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   public xc_3 id_break() {
      return this.id_protected;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_class(this.id_byte);
      var1.id_protected(xd_3.id_finally(this.id_protected));
      var1.id_class(this.id_class);
      var1.writeBoolean(this.id_throws);
   }

   public rZM id_throws() {
      return this.id_class;
   }

   public boolean id_protected() {
      return this.id_throws;
   }
}
