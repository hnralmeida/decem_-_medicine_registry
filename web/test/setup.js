process.on('unhandledRejection', (err) => {
    console.log(err)
    jest.fail(err)
});
