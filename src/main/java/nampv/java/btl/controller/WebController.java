package nampv.java.btl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// Đánh dấu đây là một Controller
// Nơi tiếp nhận các reqquest từ phía người dùng
@Controller
public class WebController {

    // Đón nhận request GET
    @GetMapping("/") // Nếu người dùng request tới địa chỉ "/"
    public String index() {
        return "index"; // Trả về file index.html
    }

    // Đón nhận request GET
    @GetMapping("/giohang.html") // Nếu người dùng request tới địa chỉ "/"
    public String giohang() {
        return "giohang"; // Trả về file index.html
    }

    @GetMapping("/chitietsanpham.html") // Nếu người dùng request tới địa chỉ "/"
    public String chitietsanpham() {
        return "chitietsanpham"; // Trả về file chitietsanpham.html
    }

    // Đón nhận request GET
    @GetMapping("/admin.html") // Nếu người dùng request tới địa chỉ "/"
    public String admin() {
        return "admin"; // Trả về file admin.html
    }

    // Đón nhận request GET
    @GetMapping("/index.html") // Nếu người dùng request tới địa chỉ "/"
    public String index1() {
        return "index"; // Trả về file index.html
    }

    // Đón nhận request GET
    @GetMapping("/nguoidung.html") // Nếu người dùng request tới địa chỉ "/"
    public String nguoidung() {
        return "nguoidung"; // Trả về file nguoidung.html
    }

    // Đón nhận request GET
    @GetMapping("/tintuc.html") // Nếu người dùng request tới địa chỉ "/"
    public String tintuc() {
        return "tintuc"; // Trả về file tintuc.html
    }

    // Đón nhận request GET
    @GetMapping("/tuyendung.html") // Nếu người dùng request tới địa chỉ "/"
    public String tuyendung() {
        return "tuyendung"; // Trả về file tuyendung.html
    }

    // Đón nhận request GET
    @GetMapping("/gioithieu.html") // Nếu người dùng request tới địa chỉ "/"
    public String gioithieu() {
        return "gioithieu"; // Trả về file gioithieu.html
    }

    // Đón nhận request GET
    @GetMapping("/trungtambaohanh.html") // Nếu người dùng request tới địa chỉ "/"
    public String baohanh() {
        return "trungtambaohanh"; // Trả về file trungtambaohanh.html
    }

    // Đón nhận request GET
    @GetMapping("/lienhe.html") // Nếu người dùng request tới địa chỉ "/"
    public String lienhe() {
        return "lienhe"; // Trả về file lienhe.html
    }
}
