<h1 align="center"> Answers for week3's question❓</h1>

1. After the call of <code>swap(jungleDVD, cinderellaDVD)</code> why does the title of these two objects still remain?  
Title của 2 object trên vẫn giữ nguyên là vì hàm <code>swap()</code> này chỉ thực hiện đổi chỗ 2 tham chiếu của 2 object <code>jungleDVD</code> và <code>cinderellaDVD</code>, chứ không tác động gì đến object thực sự.

2. After the call of <code>changeTitle(jungleDVD, cinderellaDVD.getTitle())</code> why is the title of the <code>JungleDVD</code> changed?  
Do là sau lời gọi hàm <code>changeTitle()</code>, thông qua object tham chiếu trỏ đến object <code>jungleDVD</code> thì title của object này đã được thay đổi thông qua message <code>setTitle()</code>.